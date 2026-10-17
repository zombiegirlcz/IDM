package s09;

import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public LessonScreenContract$QuizStatusViewPayload u;
    public k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f258908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f258909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f258910y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f258909x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f258908w = obj2;
        this.f258910y |= Integer.MIN_VALUE;
        return k.b3(this.f258909x, null, this);
    }
}
