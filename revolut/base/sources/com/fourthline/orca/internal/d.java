package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.nfc.NfcScannerComposableKt;
import com.fourthline.orca.core.flavor.OrcaLocalization;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class d {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27594g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentActivity f27595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OrcaLocalization f27596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f27597c;
    private final gz0 d;
    private final te e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(ComponentActivity activity, OrcaLocalization localization, Function0 finishOrcaActivity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(finishOrcaActivity, "finishOrcaActivity");
        this.f27595a = activity;
        this.f27596b = localization;
        this.f27597c = finishOrcaActivity;
        this.d = new gz0(activity, localization);
        this.e = new b3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(d dVar) {
        return NfcScannerComposableKt.isNfcSupported(dVar.f27595a);
    }

    public final v9 a(w9 cellularManagerImpl) {
        Intrinsics.checkNotNullParameter(cellularManagerImpl, "cellularManagerImpl");
        return cellularManagerImpl;
    }

    public final Activity b() {
        return this.f27595a;
    }

    public final ActivityResultRegistry d() {
        return this.f27595a.getActivityResultRegistry();
    }

    public final tz i() {
        return new tz(new ok1(this, 0));
    }

    public final Locale j() {
        return this.d.a();
    }

    public final Function0 k() {
        return new ok1(this, 1);
    }

    public final Function0 l() {
        return new ok1(this, 2);
    }

    public final gz0 m() {
        return this.d;
    }

    public final TimestampProvider n() {
        return new TimestampProviderInternal();
    }

    public final ViewModelStoreOwner o() {
        return this.f27595a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale b(d dVar) {
        return dVar.d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resources d(d dVar) {
        return dVar.d.b();
    }

    public final void a() {
        this.d.c();
    }

    public final ContentResolver c() {
        ContentResolver contentResolver = this.f27595a.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    public final List e() {
        return gz0.a(this.d, null, 1, null);
    }

    public final Context f() {
        return this.f27595a;
    }

    public final te g() {
        return this.e;
    }

    public final jy h() {
        return new jy(new ok1(this, 3));
    }

    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            this.e.a(data);
        }
    }

    public final ij0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        boolean z = mainRepository instanceof ey;
        return new cf(this.f27595a, mainRepository.getFlavor(), z ? false : mainRepository.f().getTenant().getRemoteStyles().getEnabled(), z ? false : mainRepository.f().getTenant().getBackButtonOnTop().getEnabled());
    }

    public final fh0 a(zq0 resultRepository) {
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        return new og0(resultRepository, this.f27597c);
    }

    public final LocationProvider a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new k1(FourthlineLocationHelper.getLocationProvider(this.f27595a), new k81(tracker));
    }

    public final CoroutineScope a(ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        return ViewModelKt.getViewModelScope(new ViewModelProvider(viewModelStoreOwner).get(kotlin.jvm.internal.o0.f186429a.b(ad.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale a(d dVar) {
        return dVar.d.a();
    }

    public final v90 a(Context context, fh0 orcaDestroyer, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        db dbVar = new db((ConnectivityManager) systemService, coroutineScope);
        orcaDestroyer.a((AutoCloseable) dbVar);
        return dbVar;
    }
}
