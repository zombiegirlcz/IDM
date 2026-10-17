package jnc;

import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionScreenContract$Input f176700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nmc.d f176701b;

    public n(ProjectionScreenContract$Input input, nmc.d portfolioUiMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(portfolioUiMapper, "portfolioUiMapper");
        this.f176700a = input;
        this.f176701b = portfolioUiMapper;
    }
}
