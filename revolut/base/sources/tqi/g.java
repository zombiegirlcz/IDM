package tqi;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.revolut.retail.core.navigation.ActivityDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ChooserActivityDestination;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqi.b f273605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f273606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.b f273607c;

    public g(uqi.b packageManagerRepository, zk0.b fileRepository, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(packageManagerRepository, "packageManagerRepository");
        Intrinsics.checkNotNullParameter(fileRepository, "fileRepository");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f273605a = packageManagerRepository;
        this.f273606b = fileRepository;
        this.f273607c = fileSystemRepository;
    }

    public static ActivityNavigateCommand b(c cVar, Map map, ActivityDestination activityDestination) {
        return new ActivityNavigateCommand(activityDestination, null, map, 0, (cVar.f273602c != null ? 1 : 0) | 268435456, cVar.e, null, null, null, false, 962);
    }

    public static /* synthetic */ ActivityNavigateCommand d(g gVar, CharSequence charSequence, File file, String str, int i) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        return gVar.c(charSequence, file, str, null);
    }

    public final Map a(c cVar) throws IOException {
        Pair pair;
        Pair pair2;
        Uri uriI;
        String str = cVar.f273600a;
        Pair pair3 = str != null ? new Pair("android.intent.extra.SUBJECT", str) : null;
        String str2 = cVar.f273601b;
        if (str2 != null) {
            Object objI = str2;
            if (cVar.d) {
                objI = m70.a.i(str2);
            }
            pair = new Pair("android.intent.extra.TEXT", objI);
        } else {
            pair = null;
        }
        a aVar = cVar.f273602c;
        if (aVar != null) {
            if (aVar instanceof b) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(((b) aVar).f273599b);
                try {
                    File fileN = ((a80.h) this.f273606b).n(zk0.a.INTERNAL_CACHE, byteArrayInputStream, ((b) aVar).f273598a);
                    byteArrayInputStream.close();
                    uriI = fileN != null ? ((a80.h) this.f273607c).i(fileN) : null;
                } finally {
                }
            } else {
                if (!(aVar instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                uriI = ((h) aVar).f273608a;
            }
            pair2 = new Pair("android.intent.extra.STREAM", uriI);
        } else {
            pair2 = null;
        }
        Pair[] elements = {null, null, pair3, pair, pair2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return r0.t(kotlin.collections.d.L(elements));
    }

    public final ActivityNavigateCommand c(CharSequence charSequence, File file, String str, Integer num) {
        Intrinsics.checkNotNullParameter(file, "file");
        ImplicitActivityDestination implicitActivityDestination = new ImplicitActivityDestination("android.intent.action.SEND", null, null, null, null, 30);
        Pair[] elements = {new Pair("android.intent.extra.TEXT", charSequence), new Pair("android.intent.extra.STREAM", ((a80.h) this.f273607c).i(file))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ActivityNavigateCommand(implicitActivityDestination, null, r0.t(kotlin.collections.d.L(elements)), num, 0, str, null, null, null, false, 978);
    }

    public final ActivityNavigateCommand e(CharSequence charSequence, File imageFile) {
        Intrinsics.checkNotNullParameter(imageFile, "imageFile");
        ImplicitActivityDestination implicitActivityDestination = new ImplicitActivityDestination("android.intent.action.SEND", null, null, null, null, 30);
        Pair[] elements = {new Pair("android.intent.extra.TEXT", charSequence), new Pair("android.intent.extra.STREAM", ((a80.h) this.f273607c).i(imageFile))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ActivityNavigateCommand(implicitActivityDestination, null, r0.t(kotlin.collections.d.L(elements)), null, 0, "image/*", null, null, null, false, 986);
    }

    public final ActivityNavigateCommand f(int i, String subject, String message) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.SEND", null, null, null, null, 30), null, r0.k(new Pair("android.intent.extra.TEXT", message), new Pair("android.intent.extra.SUBJECT", subject)), Integer.valueOf(i), 268435456, "text/plain", null, null, null, false, 962);
    }

    public final ActivityNavigateCommand g(c message, String actionTitle) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        return b(message, a(message), new ChooserActivityDestination("android.intent.action.SEND", null, actionTitle, 14));
    }

    public final ActivityNavigateCommand h(c message) throws IOException {
        Object next;
        Intrinsics.checkNotNullParameter(message, "message");
        Map mapA = a(message);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/html");
        PackageManager packageManager = this.f273605a.f282191a.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = listQueryIntentActivities;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ResolveInfo resolveInfo : list) {
            String packageName = resolveInfo.activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            String name = resolveInfo.activityInfo.name;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            arrayList.add(new uqi.a(packageName, name));
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            uqi.a aVar = (uqi.a) next;
            if (a0.y(aVar.f282189a, ".gm", false)) {
                break;
            }
            String lowerCase = aVar.f282190b.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (d0.J(lowerCase, "gmail", false)) {
                break;
            }
        }
        uqi.a aVar2 = (uqi.a) next;
        return b(message, mapA, new ImplicitActivityDestination("android.intent.action.SEND", null, aVar2 != null ? aVar2.f282189a : null, aVar2 != null ? aVar2.f282190b : null, null, 18));
    }
}
