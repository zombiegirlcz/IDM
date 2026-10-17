package rqi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import cpi.g;
import gh0.d;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f256548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf.c f256549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qi0.b f256550c;

    public c(Context context, yf.c googlePlayUriFactory, qi0.b appGalleryUriFactory, gi0.a mobileServicesProvider, g storeIntentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googlePlayUriFactory, "googlePlayUriFactory");
        Intrinsics.checkNotNullParameter(appGalleryUriFactory, "appGalleryUriFactory");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        Intrinsics.checkNotNullParameter(storeIntentProvider, "storeIntentProvider");
        this.f256548a = context;
        this.f256549b = googlePlayUriFactory;
        this.f256550c = appGalleryUriFactory;
    }

    public final ActivityNavigateCommand a(String appId, d target) {
        qi0.b bVar;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(target, "target");
        int i = b.f256547a[target.ordinal()];
        if (i == 1) {
            bVar = this.f256549b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = this.f256550c;
        }
        if (!d(bVar, appId)) {
            return new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, Uri.parse(bVar.e(appId)), 14), null, null, null, 0, null, null, null, null, false, 1022);
        }
        return new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, bVar.a(), null, Uri.parse(bVar.d(appId)), 10), null, null, null, 270532608, null, null, null, null, false, 1006);
    }

    public final ExternalDestination.ImplicitActivity b(String appId, d target) {
        qi0.b bVar;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(target, "target");
        int i = b.f256547a[target.ordinal()];
        if (i == 1) {
            bVar = this.f256549b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = this.f256550c;
        }
        if (!d(bVar, appId)) {
            return new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse(bVar.e(appId)), 0, null, 494);
        }
        return new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", bVar.a(), Uri.parse(bVar.d(appId)), 270532608, null, 458);
    }

    public final ActivityNavigateCommand c() {
        d dVar = d.GOOGLE;
        int i = b.f256547a[dVar.ordinal()];
        if (i == 1) {
            return a("com.revolut.revolut", dVar);
        }
        if (i == 2) {
            return a("104911585", d.HUAWEI);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean d(kh0.a aVar, String str) {
        Object next;
        List<ResolveInfo> listQueryIntentActivities = this.f256548a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(aVar.d(str))), 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it8 = listQueryIntentActivities.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((ResolveInfo) next).activityInfo.applicationInfo.packageName, aVar.a())) {
                break;
            }
        }
        return ((ResolveInfo) next) != null;
    }
}
