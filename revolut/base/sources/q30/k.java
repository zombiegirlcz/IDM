package q30;

import com.revolut.chat.domain.interactor.intro.ChatIntroVideoPreloadWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gim.c {
    public int A;
    public lx0.j u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241765x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f241766y;
    public final /* synthetic */ ChatIntroVideoPreloadWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ChatIntroVideoPreloadWorker chatIntroVideoPreloadWorker, Continuation continuation) {
        super(continuation);
        this.z = chatIntroVideoPreloadWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f241766y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.doWork(this);
    }
}
