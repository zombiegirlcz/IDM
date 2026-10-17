package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements r {
    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a$a, reason: collision with other inner class name */
    public static final class C0571a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f94017a;

        public C0571a(List list) {
            this.f94017a = list;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0571a) && Intrinsics.f(this.f94017a, ((C0571a) obj2).f94017a);
        }

        public final int hashCode() {
            List list = this.f94017a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public C0571a() {
            this(null);
        }
    }
}
