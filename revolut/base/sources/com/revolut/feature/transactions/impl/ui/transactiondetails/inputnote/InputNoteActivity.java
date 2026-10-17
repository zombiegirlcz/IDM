package com.revolut.feature.transactions.impl.ui.transactiondetails.inputnote;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.transactions.impl.R$id;
import com.revolut.feature.transactions.impl.R$layout;
import com.revolut.feature.transactions.impl.ui.transactiondetails.inputnote.InputNoteActivity;
import com.revolut.feature.transactions.impl.ui.transactiondetails.inputnote.InputNoteContract$Config;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import j90.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le.u1;
import pri.e;
import qof.b;
import rm0.k;
import rof.c;
import xpi.f;
import yhm.j;
import yp0.y;
import ypi.h;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/transactiondetails/inputnote/InputNoteActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lrof/b;", "Lrof/c;", "<init>", "()V", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputNoteActivity extends BaseDelegatesActivity implements c {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92108w0 = {o0.f186429a.j(new h0(InputNoteActivity.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public b f92109r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f92110s0;
    public final Lazy u0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Lazy f92111t0 = j.b(new k(20));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final a f92112v0 = u1.w(this, R$id.inputNote_recyclerView);

    public InputNoteActivity() {
        final int i = 0;
        this.f92110s0 = j.b(new Function0(this) { // from class: rof.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputNoteActivity f255995b;

            {
                this.f255995b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InputNoteActivity inputNoteActivity = this.f255995b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InputNoteActivity.f92108w0;
                        String strA = ((InputNoteContract$Config) inputNoteActivity.G0()).f92113a.a();
                        return a10.b.t(strA, "groupId", "TRANSACTION_DETAILS_FLOW_", strA);
                    default:
                        KProperty[] kPropertyArr2 = InputNoteActivity.f92108w0;
                        return new z4l.j(7, u.c((InputTextDelegate) inputNoteActivity.f92111t0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.u0 = j.b(new Function0(this) { // from class: rof.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputNoteActivity f255995b;

            {
                this.f255995b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InputNoteActivity inputNoteActivity = this.f255995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputNoteActivity.f92108w0;
                        String strA = ((InputNoteContract$Config) inputNoteActivity.G0()).f92113a.a();
                        return a10.b.t(strA, "groupId", "TRANSACTION_DETAILS_FLOW_", strA);
                    default:
                        KProperty[] kPropertyArr2 = InputNoteActivity.f92108w0;
                        return new z4l.j(7, u.c((InputTextDelegate) inputNoteActivity.f92111t0.getValue()), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        b bVar = this.f92109r0;
        if (bVar != null) {
            return (rof.b) bVar.f248175p.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF76305t0() {
        return (String) this.f92110s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f92109r0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f92109r0 = new b(((qof.c) com.bumptech.glide.c.l(this).b(null, getF76305t0())).U, rd0.e.g(this, bundle, null), new f(R$id.inputNote_navBarWithToolbar, true), new h(Integer.valueOf(R$id.inputNote_nextButton), null, null));
        super.onCreate(bundle);
        setContentView(R$layout.activity_input_note);
        RecyclerView recyclerView = (RecyclerView) this.f92112v0.getValue(this, f92108w0[0]);
        y.h(recyclerView, (z4l.j) this.u0.getValue(), new LinearLayoutManager(recyclerView.getContext()));
    }

    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.u0.getValue()).c(items);
    }
}
