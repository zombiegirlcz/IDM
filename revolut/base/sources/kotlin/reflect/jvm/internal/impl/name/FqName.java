package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class FqName {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final FqName ROOT = new FqName("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqNameUnsafe f187463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient FqName f187464b;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final FqName topLevel(@NotNull Name shortName) {
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            return new FqName(FqNameUnsafe.Companion.topLevel(shortName));
        }
    }

    public FqName(@NotNull String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f187463a = new FqNameUnsafe(fqName, this);
    }

    @NotNull
    public final String asString() {
        return this.f187463a.asString();
    }

    @NotNull
    public final FqName child(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new FqName(this.f187463a.child(name), this);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof FqName) {
            return Intrinsics.f(this.f187463a, ((FqName) obj2).f187463a);
        }
        return false;
    }

    public int hashCode() {
        return this.f187463a.hashCode();
    }

    public final boolean isRoot() {
        return this.f187463a.isRoot();
    }

    @NotNull
    public final FqName parent() {
        FqName fqName = this.f187464b;
        if (fqName != null) {
            return fqName;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        FqName fqName2 = new FqName(this.f187463a.parent());
        this.f187464b = fqName2;
        return fqName2;
    }

    @NotNull
    public final List<Name> pathSegments() {
        return this.f187463a.pathSegments();
    }

    @NotNull
    public final Name shortName() {
        return this.f187463a.shortName();
    }

    @NotNull
    public final Name shortNameOrSpecial() {
        return this.f187463a.shortNameOrSpecial();
    }

    public final boolean startsWith(@NotNull Name segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        return this.f187463a.startsWith(segment);
    }

    @NotNull
    public String toString() {
        return this.f187463a.toString();
    }

    @NotNull
    public final FqNameUnsafe toUnsafe() {
        return this.f187463a;
    }

    public FqName(@NotNull FqNameUnsafe fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f187463a = fqName;
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f187463a = fqNameUnsafe;
        this.f187464b = fqName;
    }
}
