package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class IncompatibleVersionErrorData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f187689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f187690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f187691c;
    public final Object d;
    public final String e;

    public IncompatibleVersionErrorData(T t2, T t3, T t5, T t7, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f187689a = t2;
        this.f187690b = t3;
        this.f187691c = t5;
        this.d = t7;
        this.e = filePath;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj2;
        return Intrinsics.f(this.f187689a, incompatibleVersionErrorData.f187689a) && Intrinsics.f(this.f187690b, incompatibleVersionErrorData.f187690b) && Intrinsics.f(this.f187691c, incompatibleVersionErrorData.f187691c) && Intrinsics.f(this.d, incompatibleVersionErrorData.d) && Intrinsics.f(this.e, incompatibleVersionErrorData.e);
    }

    public int hashCode() {
        Object obj2 = this.f187689a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f187690b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f187691c;
        int iHashCode3 = (iHashCode2 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (obj5 != null ? obj5.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb6.append(this.f187689a);
        sb6.append(", compilerVersion=");
        sb6.append(this.f187690b);
        sb6.append(", languageVersion=");
        sb6.append(this.f187691c);
        sb6.append(", expectedVersion=");
        sb6.append(this.d);
        sb6.append(", filePath=");
        return a.u(sb6, this.e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
