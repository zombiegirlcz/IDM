package syj;

import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public LessonScreenContract$QuizStatusViewPayload u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f266678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f266679x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f266678w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f266679x |= Integer.MIN_VALUE;
        return this.f266678w.e(null, this);
    }
}
