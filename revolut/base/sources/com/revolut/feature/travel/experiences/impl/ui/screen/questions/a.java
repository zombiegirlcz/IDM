package com.revolut.feature.travel.experiences.impl.ui.screen.questions;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements r {
    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.feature.travel.experiences.impl.ui.screen.questions.a$a, reason: collision with other inner class name */
    public static final class C0563a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f93123a;

        public C0563a(List userAnswersList) {
            Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
            this.f93123a = userAnswersList;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0563a) && Intrinsics.f(this.f93123a, ((C0563a) obj2).f93123a);
        }

        public final int hashCode() {
            return this.f93123a.hashCode();
        }

        public C0563a() {
            this(f0.f322471a);
        }
    }
}
