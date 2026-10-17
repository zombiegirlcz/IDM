package com.revolut.feature.junior.isa.impl.ui.jisa_national_number_info;

import a0.d;
import aii.q;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number_info.JuniorIsaNationalNumberInfo;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import ue0.e;
import uwe.f;
import x98.m;
import x98.o;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_national_number_info/JuniorIsaNationalNumberInfo;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "<init>", "()V", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorIsaNationalNumberInfo extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final List S = v.k(new CellDetailsStandaloneNoteDelegate(), new CellDetailsNoteDelegate());

    public JuniorIsaNationalNumberInfo() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: va8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaNationalNumberInfo f287173b;

            {
                this.f287173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorIsaNationalNumberInfo juniorIsaNationalNumberInfo = this.f287173b;
                switch (i2) {
                    case 0:
                        int i3 = JuniorIsaNationalNumberInfo.T;
                        phm.a aVar = (phm.a) e.j(juniorIsaNationalNumberInfo.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        m mVar = new m();
                        mVar.f303625a = e4m.b.b(new vk6.a(17));
                        return mVar;
                    default:
                        int i5 = JuniorIsaNationalNumberInfo.T;
                        return (b) ((m) juniorIsaNationalNumberInfo.Q.getValue()).f303625a.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: va8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaNationalNumberInfo f287173b;

            {
                this.f287173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorIsaNationalNumberInfo juniorIsaNationalNumberInfo = this.f287173b;
                switch (i22) {
                    case 0:
                        int i3 = JuniorIsaNationalNumberInfo.T;
                        phm.a aVar = (phm.a) e.j(juniorIsaNationalNumberInfo.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        m mVar = new m();
                        mVar.f303625a = e4m.b.b(new vk6.a(17));
                        return mVar;
                    default:
                        int i5 = JuniorIsaNationalNumberInfo.T;
                        return (b) ((m) juniorIsaNationalNumberInfo.Q.getValue()).f303625a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (va8.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new f(this, null, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (va8.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
