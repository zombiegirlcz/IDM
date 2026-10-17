package g50;

import cli.g;
import cli.y;
import cli.z;
import com.revolut.chat.ui.introvideo.ChatIntroVideoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends h implements z {
    public final ChatIntroVideoScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q30.a f140599p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f140600q;

    public f(ChatIntroVideoScreenContract$InputData inputData, q30.a chatIntroInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatIntroInteractor, "chatIntroInteractor");
        this.o = inputData;
        this.f140599p = chatIntroInteractor;
        this.f140600q = mra.d.b(this, new d(null), new a54.b(10), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new e(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f140600q;
    }
}
