package yw6;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview.FreelancerPluginPreviewScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y66.q;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw6.b f317343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerPluginPreviewScreenContract$InputData f317344b;

    public i(ax6.a pluginPreviewItemsFactory, vw6.b pluginCommonItemsFactory, FreelancerPluginPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(pluginPreviewItemsFactory, "pluginPreviewItemsFactory");
        Intrinsics.checkNotNullParameter(pluginCommonItemsFactory, "pluginCommonItemsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f317343a = pluginCommonItemsFactory;
        this.f317344b = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(domainState.f317336a, new yv8.j(6), new yi3.d(this, 26), new q(this, domainState, 17));
    }
}
