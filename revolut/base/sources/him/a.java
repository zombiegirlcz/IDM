package him;

import java.io.Serializable;
import kotlin.collections.a;
import kotlin.collections.d;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends kotlin.collections.a implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f152621a;

    public a(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f152621a = entries;
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        if (!(obj2 instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj2;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) d.W(element.ordinal(), this.f152621a)) == element;
    }

    @Override // kotlin.collections.a, java.util.List
    public final Object get(int i) {
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        Enum[] enumArr = this.f152621a;
        int length = enumArr.length;
        c1058a.getClass();
        a.Companion.b(i, length);
        return enumArr[i];
    }

    @Override // zhm.a
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f152621a.length;
    }

    @Override // kotlin.collections.a, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj2;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) d.W(iOrdinal, this.f152621a)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.List
    public final int lastIndexOf(Object obj2) {
        if (!(obj2 instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj2;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) d.W(iOrdinal, this.f152621a)) == element) {
            return iOrdinal;
        }
        return -1;
    }
}
