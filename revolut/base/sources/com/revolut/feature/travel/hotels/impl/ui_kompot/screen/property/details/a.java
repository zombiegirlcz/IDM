package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.a$a, reason: collision with other inner class name */
    public static final class C0570a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0570a f93984a = new C0570a();

        private C0570a() {
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f93985a = new b();

        private b() {
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f93986a;

        public c() {
            this(3, null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f93986a, ((c) obj2).f93986a);
        }

        public final int hashCode() {
            Clause clause = this.f93986a;
            return (clause == null ? 0 : clause.hashCode()) * 31;
        }

        public c(int i, TextLocalisedClause textLocalisedClause) {
            this.f93986a = (i & 1) != 0 ? null : textLocalisedClause;
        }
    }

    private a() {
    }
}
