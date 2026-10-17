package com.revolut.feature.transactions.impl.ui.receipts;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsReceiptDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transactions.impl.ui.receipts.TransactionDetailsReceiptsActivity;
import com.revolut.feature.transactions.impl.ui.receipts.TransactionDetailsReceiptsContract$Configuration;
import gsi.a;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pnf.b;
import pnf.c;
import pri.e;
import qof.d;
import te0.w;
import xpi.f;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/receipts/TransactionDetailsReceiptsActivity;", "Lhpi/h;", "Lpnf/b;", "Lpnf/c;", "<init>", "()V", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionDetailsReceiptsActivity extends h implements c {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f92080w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f92081s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f92082t0;
    public final Object u0 = w.y0(new pka.c(27));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f92083v0;

    public TransactionDetailsReceiptsActivity() {
        final int i = 0;
        this.f92082t0 = w.y0(new Function0(this) { // from class: pnf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsReceiptsActivity f237749b;

            {
                this.f237749b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionDetailsReceiptsActivity transactionDetailsReceiptsActivity = this.f237749b;
                switch (i2) {
                    case 0:
                        int i3 = TransactionDetailsReceiptsActivity.f92080w0;
                        return ((TransactionDetailsReceiptsContract$Configuration) transactionDetailsReceiptsActivity.G0()).f92084a;
                    default:
                        int i5 = TransactionDetailsReceiptsActivity.f92080w0;
                        return new j(7, u.c((CellDetailsReceiptDelegate) transactionDetailsReceiptsActivity.u0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.f92083v0 = w.y0(new Function0(this) { // from class: pnf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsReceiptsActivity f237749b;

            {
                this.f237749b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionDetailsReceiptsActivity transactionDetailsReceiptsActivity = this.f237749b;
                switch (i22) {
                    case 0:
                        int i3 = TransactionDetailsReceiptsActivity.f92080w0;
                        return ((TransactionDetailsReceiptsContract$Configuration) transactionDetailsReceiptsActivity.G0()).f92084a;
                    default:
                        int i5 = TransactionDetailsReceiptsActivity.f92080w0;
                        return new j(7, u.c((CellDetailsReceiptDelegate) transactionDetailsReceiptsActivity.u0.getValue()), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        d dVar = this.f92081s0;
        if (dVar != null) {
            return (b) dVar.f248206n.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return (String) this.f92082t0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        d dVar = this.f92081s0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qof.c cVar = ((qof.c) com.bumptech.glide.c.l(this).b(null, getF82699s0())).U;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        this.f92081s0 = new d(cVar, dVarG, (TransactionDetailsReceiptsContract$Configuration) G0());
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f92083v0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f92083v0.getValue()).c(items);
    }
}
