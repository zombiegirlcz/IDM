package com.revolut.feature.learn.shared.impl.ui.course.overview.transformer;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/course/overview/transformer/BrokenCourseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrokenCourseException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f78010a;

    public BrokenCourseException() {
        this(null);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f78010a;
    }

    public BrokenCourseException(Throwable th10) {
        this.f78010a = th10;
    }
}
