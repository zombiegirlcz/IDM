package a09;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 extends kotlin.jvm.internal.q implements Function1 {
    public static final c0 f = new c0();

    public c0() {
        super(1, nz8.f.class, "toDomain", "toDomain(Lcom/revolut/feature/learn/shared/impl/data/network/dto/lesson/LessonDto;)Lcom/revolut/feature/learn/shared/models/domain/LearnLesson;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        uz8.i p0 = (uz8.i) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return nz8.f.b(p0);
    }
}
