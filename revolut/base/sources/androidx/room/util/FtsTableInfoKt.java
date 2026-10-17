package androidx.room.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.d0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000¨\u0006\t"}, d2 = {"equalsCommon", "", "Landroidx/room/util/FtsTableInfo;", "other", "", "hashCodeCommon", "", "toStringCommon", "", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class FtsTableInfoKt {
    public static final boolean equalsCommon(@NotNull FtsTableInfo ftsTableInfo, Object obj2) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "<this>");
        if (ftsTableInfo == obj2) {
            return true;
        }
        if (!(obj2 instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo2 = (FtsTableInfo) obj2;
        if (Intrinsics.f(ftsTableInfo.name, ftsTableInfo2.name) && Intrinsics.f(ftsTableInfo.columns, ftsTableInfo2.columns)) {
            return Intrinsics.f(ftsTableInfo.options, ftsTableInfo2.options);
        }
        return false;
    }

    public static final int hashCodeCommon(@NotNull FtsTableInfo ftsTableInfo) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "<this>");
        return ftsTableInfo.options.hashCode() + a.f(ftsTableInfo.name.hashCode() * 31, 31, ftsTableInfo.columns);
    }

    @NotNull
    public static final String toStringCommon(@NotNull FtsTableInfo ftsTableInfo) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "<this>");
        return t.f("\n            |FtsTableInfo {\n            |   name = '" + ftsTableInfo.name + "',\n            |   columns = {" + TableInfoKt.formatString(d0.O0(ftsTableInfo.columns)) + "\n            |   options = {" + TableInfoKt.formatString(d0.O0(ftsTableInfo.options)) + "\n            |}\n        ");
    }
}
