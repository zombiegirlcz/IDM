package com.revolut.feature.insurance_pet.impl.ui.hub.screen;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.insurance_pet.impl.ui.hub.screen.PetHubFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nz7.b;
import nz7.c;
import pri.e;
import prk.o;
import te0.w;
import wy7.d;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/hub/screen/PetHubFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lnz7/b;", "Lnz7/c;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetHubFragment extends BaseLayoutBuilderFragment<b, c> implements c {
    public static final /* synthetic */ int p0 = 0;
    public final Object f0;
    public final Object g0 = w.y0(new nwf.b(12));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f76340h0 = w.y0(new nwf.b(13));
    public final Object i0 = w.y0(new nwf.b(14));
    public final Object j0 = w.y0(new nwf.b(15));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f76341k0 = w.y0(new nwf.b(16));
    public final Object l0 = w.y0(new nwf.b(17));
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f76342n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f76343o0;

    public PetHubFragment() {
        final int i = 2;
        this.f0 = w.y0(new Function0(this) { // from class: nz7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetHubFragment f220974b;

            {
                this.f220974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetHubFragment petHubFragment = this.f220974b;
                switch (i2) {
                    case 0:
                        int i3 = PetHubFragment.p0;
                        return (opi.b) ((wy7.d) petHubFragment.f0.getValue()).f301125b.f301133l.get();
                    case 1:
                        int i5 = PetHubFragment.p0;
                        return v.k((DatePickerDelegate) petHubFragment.f76341k0.getValue(), (LargeActionButtonDelegate) petHubFragment.j0.getValue());
                    case 2:
                        int i6 = PetHubFragment.p0;
                        wy7.e eVar = (wy7.e) ((wy7.i) jb3.l.q(petHubFragment));
                        return new wy7.d(eVar.f301128b, eVar.f301129c);
                    default:
                        return new z4l.j(7, v.k((TextDelegate) petHubFragment.g0.getValue(), (BannerDelegate) petHubFragment.f76340h0.getValue(), (BigTileDelegate) petHubFragment.i0.getValue(), (ProductSelectionDelegate) petHubFragment.l0.getValue(), new ListSubheaderDelegate()), false);
                }
            }
        });
        final int i2 = 3;
        this.m0 = w.y0(new Function0(this) { // from class: nz7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetHubFragment f220974b;

            {
                this.f220974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetHubFragment petHubFragment = this.f220974b;
                switch (i22) {
                    case 0:
                        int i3 = PetHubFragment.p0;
                        return (opi.b) ((wy7.d) petHubFragment.f0.getValue()).f301125b.f301133l.get();
                    case 1:
                        int i5 = PetHubFragment.p0;
                        return v.k((DatePickerDelegate) petHubFragment.f76341k0.getValue(), (LargeActionButtonDelegate) petHubFragment.j0.getValue());
                    case 2:
                        int i6 = PetHubFragment.p0;
                        wy7.e eVar = (wy7.e) ((wy7.i) jb3.l.q(petHubFragment));
                        return new wy7.d(eVar.f301128b, eVar.f301129c);
                    default:
                        return new z4l.j(7, v.k((TextDelegate) petHubFragment.g0.getValue(), (BannerDelegate) petHubFragment.f76340h0.getValue(), (BigTileDelegate) petHubFragment.i0.getValue(), (ProductSelectionDelegate) petHubFragment.l0.getValue(), new ListSubheaderDelegate()), false);
                }
            }
        });
        final int i3 = 0;
        this.f76342n0 = w.y0(new Function0(this) { // from class: nz7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetHubFragment f220974b;

            {
                this.f220974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PetHubFragment petHubFragment = this.f220974b;
                switch (i22) {
                    case 0:
                        int i32 = PetHubFragment.p0;
                        return (opi.b) ((wy7.d) petHubFragment.f0.getValue()).f301125b.f301133l.get();
                    case 1:
                        int i5 = PetHubFragment.p0;
                        return v.k((DatePickerDelegate) petHubFragment.f76341k0.getValue(), (LargeActionButtonDelegate) petHubFragment.j0.getValue());
                    case 2:
                        int i6 = PetHubFragment.p0;
                        wy7.e eVar = (wy7.e) ((wy7.i) jb3.l.q(petHubFragment));
                        return new wy7.d(eVar.f301128b, eVar.f301129c);
                    default:
                        return new z4l.j(7, v.k((TextDelegate) petHubFragment.g0.getValue(), (BannerDelegate) petHubFragment.f76340h0.getValue(), (BigTileDelegate) petHubFragment.i0.getValue(), (ProductSelectionDelegate) petHubFragment.l0.getValue(), new ListSubheaderDelegate()), false);
                }
            }
        });
        final int i5 = 1;
        this.f76343o0 = w.y0(new Function0(this) { // from class: nz7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetHubFragment f220974b;

            {
                this.f220974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PetHubFragment petHubFragment = this.f220974b;
                switch (i22) {
                    case 0:
                        int i32 = PetHubFragment.p0;
                        return (opi.b) ((wy7.d) petHubFragment.f0.getValue()).f301125b.f301133l.get();
                    case 1:
                        int i59 = PetHubFragment.p0;
                        return v.k((DatePickerDelegate) petHubFragment.f76341k0.getValue(), (LargeActionButtonDelegate) petHubFragment.j0.getValue());
                    case 2:
                        int i6 = PetHubFragment.p0;
                        wy7.e eVar = (wy7.e) ((wy7.i) jb3.l.q(petHubFragment));
                        return new wy7.d(eVar.f301128b, eVar.f301129c);
                    default:
                        return new z4l.j(7, v.k((TextDelegate) petHubFragment.g0.getValue(), (BannerDelegate) petHubFragment.f76340h0.getValue(), (BigTileDelegate) petHubFragment.i0.getValue(), (ProductSelectionDelegate) petHubFragment.l0.getValue(), new ListSubheaderDelegate()), false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a((j) this.m0.getValue(), new DefaultItemAnimator(), o.u(), BitmapDescriptorFactory.HUE_RED, 24);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment, com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((opi.b) this.f76342n0.getValue()).Y("REMINDER_DATE_PICKER_DIALOG_DELEGATE_KEY", (List) this.f76343o0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        return (b) ((d) this.f0.getValue()).f301126c.get();
    }
}
