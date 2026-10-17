package com.revolut.feature.extension_auth.impl.ui;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit_resources.R$attr;
import gaa.b;
import ge6.d;
import gsi.a;
import hpi.c;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import pri.e;
import te0.w;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/extension_auth/impl/ui/ExtensionAuthActivity;", "Lhpi/h;", "Lge6/b;", "Lge6/d;", "<init>", "()V", "feature_extension_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtensionAuthActivity extends h implements d {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f72196w0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ee6.d f72198t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f72197s0 = "EXTENSION_AUTH_FLOW";
    public final Object u0 = w.y0(new b(11));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f72199v0 = w.y0(new g8i.h(this, 5));

    @Override // nri.b
    public final e F0() {
        ee6.d dVar = this.f72198t0;
        if (dVar != null) {
            return (ge6.b) dVar.f125099p.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.f72197s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        ee6.d dVar = this.f72198t0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(164.0f, R$attr.uikit_windowBackground, LDSFile.EF_DG2_TAG));
        cVar.e = true;
        jqi.d.Companion.getClass();
        jqi.d configuration = jqi.d.f177727b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f154553j = configuration;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ee6.e eVar = ((ee6.e) com.bumptech.glide.c.l(this).b(null, this.f72197s0)).f;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        jqi.d.Companion.getClass();
        this.f72198t0 = new ee6.d(eVar, dVarG);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f72199v0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f72199v0.getValue()).c(items);
    }
}
