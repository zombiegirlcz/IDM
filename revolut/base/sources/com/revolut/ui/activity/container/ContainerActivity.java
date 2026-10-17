package com.revolut.ui.activity.container;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import au0.b2;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$id;
import com.revolut.ui.activity.container.ContainerActivity;
import com.revolut.ui.activity.container.ContainerScreenContract$Configuration;
import et6.m0;
import ewl.b;
import ewl.f;
import ewl.i;
import ifm.c;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import org.jetbrains.annotations.NotNull;
import pri.e;
import v2l.a;
import yhm.d;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/ui/activity/container/ContainerActivity;", "Lv2l/a;", "Lewl/i;", "Lewl/f;", "", "Lno/d1;", "<init>", "()V", "Companion", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ContainerActivity extends a implements f, d1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public u41.a u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public c f107066v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Lazy f107067w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Lazy f107068x0;

    /* JADX INFO: renamed from: com.revolut.ui.activity.container.ContainerActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ContainerActivity() {
        final int i = 0;
        this.f107067w0 = j.b(new Function0(this) { // from class: ewl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContainerActivity f130322b;

            {
                this.f130322b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ContainerActivity containerActivity = this.f130322b;
                switch (i2) {
                    case 0:
                        ContainerActivity.Companion companion = ContainerActivity.INSTANCE;
                        return containerActivity.h1().f107071c;
                    default:
                        ContainerActivity.Companion companion2 = ContainerActivity.INSTANCE;
                        Parcelable parcelableExtra = containerActivity.getIntent().getParcelableExtra("CONFIGURATION_ARG");
                        if (parcelableExtra == null || !(parcelableExtra instanceof ContainerScreenContract$Configuration)) {
                            throw new IllegalStateException(j6.a.q("Container activity can work only with ContainerScreenContract.Configuration config is ", parcelableExtra != null ? parcelableExtra.getClass().getName() : null));
                        }
                        return (ContainerScreenContract$Configuration) parcelableExtra;
                }
            }
        });
        final int i2 = 1;
        this.f107068x0 = j.b(new Function0(this) { // from class: ewl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContainerActivity f130322b;

            {
                this.f130322b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ContainerActivity containerActivity = this.f130322b;
                switch (i22) {
                    case 0:
                        ContainerActivity.Companion companion = ContainerActivity.INSTANCE;
                        return containerActivity.h1().f107071c;
                    default:
                        ContainerActivity.Companion companion2 = ContainerActivity.INSTANCE;
                        Parcelable parcelableExtra = containerActivity.getIntent().getParcelableExtra("CONFIGURATION_ARG");
                        if (parcelableExtra == null || !(parcelableExtra instanceof ContainerScreenContract$Configuration)) {
                            throw new IllegalStateException(j6.a.q("Container activity can work only with ContainerScreenContract.Configuration config is ", parcelableExtra != null ? parcelableExtra.getClass().getName() : null));
                        }
                        return (ContainerScreenContract$Configuration) parcelableExtra;
                }
            }
        });
    }

    @Override // u2l.a, dri.a
    public final boolean D0() {
        Boolean bool = h1().f107070b;
        return bool != null ? bool.booleanValue() : !false;
    }

    @Override // nri.b
    public final e F0() {
        u41.a aVar = this.u0;
        if (aVar != null) {
            return (i) aVar.V.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF94435t0() {
        return (String) this.f107067w0.getValue();
    }

    @Override // u2l.a
    public final w2l.a Z0() {
        u41.a aVar = this.u0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // v2l.a
    public final hpi.c g1() {
        int i = b.f130323a[h1().f107069a.ordinal()];
        if (i == 1) {
            return new hpi.c(new hpi.e((Object) null));
        }
        if (i == 2) {
            hpi.c cVar = new hpi.c(new hpi.e((Object) null));
            hpi.c.b(cVar);
            return cVar;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        hpi.c cVar2 = new hpi.c(new hpi.e((Object) null));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar2.f = configuration;
        hpi.c.b(cVar2);
        return cVar2;
    }

    public final ContainerScreenContract$Configuration h1() {
        return (ContainerScreenContract$Configuration) this.f107068x0.getValue();
    }

    @Override // v2l.a, u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String f89196t0 = getF94435t0();
        if (f89196t0 != null) {
            com.bumptech.glide.c.l(this).b(null, f89196t0).getClass();
            throw new ClassCastException();
        }
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        phm.a aVar = (phm.a) ue0.e.j(applicationContext).a().get(u41.b.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", u41.b.class, " is not found"));
        }
        this.u0 = new u41.a(((u41.b) aVar2.b()).z, new xoi.j(), this);
        Integer num = h1().f;
        if (num != null) {
            setTheme(num.intValue());
        }
        super.onCreate(bundle);
        ewl.d dVar = h1().f107069a;
        ewl.d dVar2 = ewl.d.TOOLBAR_NEXT_BUTTON;
        jpi.a aVar3 = this.f285752s0;
        if (dVar == dVar2) {
            aVar3.b().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
            this.f107066v0 = aVar3.b().f59410q.subscribe(new m0(21, new eu7.c(this, 16)));
        }
        if (h1().f107069a == ewl.d.NEXT_BUTTON || h1().f107069a == dVar2) {
            aVar3.a().setOnClickListener(new b2(this, 25));
            aVar3.a().addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 6));
        }
        if (bundle != null) {
            return;
        }
        String stringExtra = h1().e;
        if (stringExtra == null && (stringExtra = getIntent().getStringExtra("fragmentClass")) == null) {
            return;
        }
        Fragment fragmentInstantiate = Fragment.instantiate(this, stringExtra, h1().d);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "instantiate(...)");
        getSupportFragmentManager().beginTransaction().add(R$id.fragment_container, fragmentInstantiate, stringExtra).commit();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        c cVar = this.f107066v0;
        if (cVar != null) {
            cVar.dispose();
        }
        super.onDestroy();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        w53.b.Companion.getClass();
        if (w53.a.a(intent) != null) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            for (Fragment fragment : fragments) {
            }
        }
        super.onNewIntent(intent);
    }
}
