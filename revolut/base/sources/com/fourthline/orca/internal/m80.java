package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface m80 {

    public interface a extends m80 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.m80$a$a, reason: collision with other inner class name */
        public static final class C0250a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a9 f31099a;

            public C0250a(a9 buttonState) {
                Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                this.f31099a = buttonState;
            }

            @Override // com.fourthline.orca.internal.m80.a
            public /* bridge */ a a(boolean z) {
                return super.a(z);
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0250a) && Intrinsics.f(this.f31099a, ((C0250a) obj2).f31099a);
            }

            public int hashCode() {
                return this.f31099a.hashCode();
            }

            public String toString() {
                return "Back(buttonState=" + this.f31099a + ")";
            }

            @Override // com.fourthline.orca.internal.m80
            public a9 a() {
                return this.f31099a;
            }

            public /* synthetic */ C0250a(a9 a9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new a9(c81.f27404a.a(R.string.shared_button_back, R.string.shared_button_back_accessibility), false, false, 6, null) : a9Var);
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a9 f31100a;

            public b(a9 buttonState) {
                Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                this.f31100a = buttonState;
            }

            @Override // com.fourthline.orca.internal.m80.a
            public /* bridge */ a a(boolean z) {
                return super.a(z);
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f31100a, ((b) obj2).f31100a);
            }

            public int hashCode() {
                return this.f31100a.hashCode();
            }

            public String toString() {
                return "Exit(buttonState=" + this.f31100a + ")";
            }

            @Override // com.fourthline.orca.internal.m80
            public a9 a() {
                return this.f31100a;
            }

            public /* synthetic */ b(a9 a9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new a9(c81.a.a(c81.f27404a, R.string.shared_button_exit, 0, 2, null), false, false, 6, null) : a9Var);
            }

            public b(boolean z) {
                this(new a9(c81.a.a(c81.f27404a, R.string.shared_button_exit, 0, 2, null), z, false, 4, null));
            }
        }

        default a a(boolean z) {
            if (this instanceof C0250a) {
                return new C0250a(a9.a(((C0250a) this).a(), null, z, false, 5, null));
            }
            if (this instanceof b) {
                return new b(a9.a(((b) this).a(), null, z, false, 5, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class b implements m80 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a9 f31101a;

        public b(a9 buttonState) {
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            this.f31101a = buttonState;
        }

        public final b a(a9 buttonState) {
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            return new b(buttonState);
        }

        public final b b(boolean z) {
            return new b(a9.a(a(), null, z, false, 5, null));
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f31101a, ((b) obj2).f31101a);
        }

        public int hashCode() {
            return this.f31101a.hashCode();
        }

        public String toString() {
            return "Next(buttonState=" + this.f31101a + ")";
        }

        @Override // com.fourthline.orca.internal.m80
        public a9 a() {
            return this.f31101a;
        }

        public /* synthetic */ b(a9 a9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new a9(c81.a.a(c81.f27404a, R.string.shared_button_continue, 0, 2, null), false, false, 6, null) : a9Var);
        }

        public final b a(boolean z, boolean z3) {
            return new b(a9.a(a(), null, z, z3, 1, null));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(c81 text) {
            this(new a9(text, false, false, 6, null));
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public b(boolean z) {
            this(new a9(c81.a.a(c81.f27404a, R.string.shared_button_continue, 0, 2, null), z, false, 4, null));
        }

        public b(boolean z, boolean z3) {
            this(new a9(c81.a.a(c81.f27404a, R.string.shared_button_continue, 0, 2, null), z, z3));
        }
    }

    a9 a();
}
