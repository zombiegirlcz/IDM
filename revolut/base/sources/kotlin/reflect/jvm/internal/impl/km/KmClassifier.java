package kotlin.reflect.jvm.internal.impl.km;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class KmClassifier {

    public static final class Class extends KmClassifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f186769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f186769a = name;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Class) && Intrinsics.f(this.f186769a, ((Class) obj2).f186769a);
        }

        @NotNull
        public final String getName() {
            return this.f186769a;
        }

        public int hashCode() {
            return this.f186769a.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("Class(name="), this.f186769a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class TypeAlias extends KmClassifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f186770a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeAlias(@NotNull String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f186770a = name;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TypeAlias) && Intrinsics.f(this.f186770a, ((TypeAlias) obj2).f186770a);
        }

        @NotNull
        public final String getName() {
            return this.f186770a;
        }

        public int hashCode() {
            return this.f186770a.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("TypeAlias(name="), this.f186770a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class TypeParameter extends KmClassifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f186771a;

        public TypeParameter(int i) {
            super(null);
            this.f186771a = i;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TypeParameter) && this.f186771a == ((TypeParameter) obj2).f186771a;
        }

        public final int getId() {
            return this.f186771a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f186771a);
        }

        @NotNull
        public String toString() {
            return a.t(new StringBuilder("TypeParameter(id="), this.f186771a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public KmClassifier(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
