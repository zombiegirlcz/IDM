package hl;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.jvm.internal.Intrinsics;
import ml.c;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BehaviorSubject f152970a;

    public a() {
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(c.f206517a);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.f152970a = behaviorSubjectD;
    }
}
