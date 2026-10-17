package androidx.room.util;

import androidx.room.util.TableInfo;
import cim.b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.t;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0000\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\tH\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\rH\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\rH\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u000eH\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u000eH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u0011H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u0011H\u0002¨\u0006\u0015"}, d2 = {"equalsCommon", "", "Landroidx/room/util/TableInfo;", "other", "", "hashCodeCommon", "", "toStringCommon", "", "Landroidx/room/util/TableInfo$Column;", "defaultValueEqualsCommon", "current", "containsSurroundingParenthesis", "Landroidx/room/util/TableInfo$ForeignKey;", "Landroidx/room/util/TableInfo$Index;", "formatString", "collection", "", "joinToStringMiddleWithIndent", "", "joinToStringEndWithIndent", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TableInfoKt {
    private static final boolean containsSurroundingParenthesis(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i5 = i3 + 1;
            if (i3 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i2++;
            } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                return false;
            }
            i++;
            i3 = i5;
        }
        return i2 == 0;
    }

    public static final boolean defaultValueEqualsCommon(@NotNull String current, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.f(current, str)) {
            return true;
        }
        if (!containsSurroundingParenthesis(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Intrinsics.f(d0.F0(strSubstring).toString(), str);
    }

    public static final boolean equalsCommon(@NotNull TableInfo tableInfo, Object obj2) {
        Set<TableInfo.Index> set;
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        if (tableInfo == obj2) {
            return true;
        }
        if (!(obj2 instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo2 = (TableInfo) obj2;
        if (!Intrinsics.f(tableInfo.name, tableInfo2.name) || !Intrinsics.f(tableInfo.columns, tableInfo2.columns) || !Intrinsics.f(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        Set<TableInfo.Index> set2 = tableInfo.indices;
        if (set2 == null || (set = tableInfo2.indices) == null) {
            return true;
        }
        return Intrinsics.f(set2, set);
    }

    @NotNull
    public static final String formatString(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return t.b(zhm.d0.k0(collection, ",\n", "\n", "\n", 0, null, 56), "    ") + "},";
    }

    public static final int hashCodeCommon(@NotNull TableInfo tableInfo) {
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        return tableInfo.foreignKeys.hashCode() + a.e(tableInfo.name.hashCode() * 31, 31, tableInfo.columns);
    }

    private static final void joinToStringEndWithIndent(Collection<?> collection) {
        t.b(zhm.d0.k0(collection, ",", null, null, 0, null, 62), "    ");
        t.b(" }", "    ");
    }

    private static final void joinToStringMiddleWithIndent(Collection<?> collection) {
        t.b(zhm.d0.k0(collection, ",", null, null, 0, null, 62), "    ");
        t.b("},", "    ");
    }

    @NotNull
    public static final String toStringCommon(@NotNull TableInfo tableInfo) {
        Collection collectionP0;
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        StringBuilder sb6 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb6.append(tableInfo.name);
        sb6.append("',\n            |    columns = {");
        sb6.append(formatString(zhm.d0.P0(tableInfo.columns.values(), new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b(((TableInfo.Column) t2).name, ((TableInfo.Column) t3).name);
            }
        })));
        sb6.append("\n            |    foreignKeys = {");
        sb6.append(formatString(tableInfo.foreignKeys));
        sb6.append("\n            |    indices = {");
        Set<TableInfo.Index> set = tableInfo.indices;
        if (set == null || (collectionP0 = zhm.d0.P0(set, new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b(((TableInfo.Index) t2).name, ((TableInfo.Index) t3).name);
            }
        })) == null) {
            collectionP0 = f0.f322471a;
        }
        sb6.append(formatString(collectionP0));
        sb6.append("\n            |}\n        ");
        return t.f(sb6.toString());
    }

    public static final int hashCodeCommon(@NotNull TableInfo.Column column) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        return (((((column.name.hashCode() * 31) + column.affinity) * 31) + (column.notNull ? 1231 : 1237)) * 31) + column.primaryKeyPosition;
    }

    public static final boolean equalsCommon(@NotNull TableInfo.Column column, Object obj2) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        if (column == obj2) {
            return true;
        }
        if (!(obj2 instanceof TableInfo.Column)) {
            return false;
        }
        TableInfo.Column column2 = (TableInfo.Column) obj2;
        if (column.isPrimaryKey() != column2.isPrimaryKey() || !Intrinsics.f(column.name, column2.name) || column.notNull != column2.notNull) {
            return false;
        }
        String str = column.defaultValue;
        String str2 = column2.defaultValue;
        if (column.createdFrom == 1 && column2.createdFrom == 2 && str != null && !defaultValueEqualsCommon(str, str2)) {
            return false;
        }
        if (column.createdFrom == 2 && column2.createdFrom == 1 && str2 != null && !defaultValueEqualsCommon(str2, str)) {
            return false;
        }
        int i = column.createdFrom;
        return (i == 0 || i != column2.createdFrom || (str == null ? str2 == null : defaultValueEqualsCommon(str, str2))) && column.affinity == column2.affinity;
    }

    public static final int hashCodeCommon(@NotNull TableInfo.ForeignKey foreignKey) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        return foreignKey.referenceColumnNames.hashCode() + a.d(a.c(a.c(foreignKey.referenceTable.hashCode() * 31, 31, foreignKey.onDelete), 31, foreignKey.onUpdate), 31, foreignKey.columnNames);
    }

    public static final int hashCodeCommon(@NotNull TableInfo.Index index) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        return index.orders.hashCode() + a.d((((a0.H(index.name, "index_", false) ? -1184239155 : index.name.hashCode()) * 31) + (index.unique ? 1 : 0)) * 31, 31, index.columns);
    }

    public static final boolean equalsCommon(@NotNull TableInfo.ForeignKey foreignKey, Object obj2) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        if (foreignKey == obj2) {
            return true;
        }
        if (!(obj2 instanceof TableInfo.ForeignKey)) {
            return false;
        }
        TableInfo.ForeignKey foreignKey2 = (TableInfo.ForeignKey) obj2;
        if (Intrinsics.f(foreignKey.referenceTable, foreignKey2.referenceTable) && Intrinsics.f(foreignKey.onDelete, foreignKey2.onDelete) && Intrinsics.f(foreignKey.onUpdate, foreignKey2.onUpdate) && Intrinsics.f(foreignKey.columnNames, foreignKey2.columnNames)) {
            return Intrinsics.f(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    @NotNull
    public static final String toStringCommon(@NotNull TableInfo.Column column) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        StringBuilder sb6 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb6.append(column.name);
        sb6.append("',\n            |   type = '");
        sb6.append(column.type);
        sb6.append("',\n            |   affinity = '");
        sb6.append(column.affinity);
        sb6.append("',\n            |   notNull = '");
        sb6.append(column.notNull);
        sb6.append("',\n            |   primaryKeyPosition = '");
        sb6.append(column.primaryKeyPosition);
        sb6.append("',\n            |   defaultValue = '");
        String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb6.append(str);
        sb6.append("'\n            |}\n        ");
        return t.b(t.f(sb6.toString()), "    ");
    }

    public static final boolean equalsCommon(@NotNull TableInfo.Index index, Object obj2) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        if (index == obj2) {
            return true;
        }
        if (obj2 instanceof TableInfo.Index) {
            TableInfo.Index index2 = (TableInfo.Index) obj2;
            if (index.unique == index2.unique && Intrinsics.f(index.columns, index2.columns) && Intrinsics.f(index.orders, index2.orders)) {
                if (a0.H(index.name, "index_", false)) {
                    return a0.H(index2.name, "index_", false);
                }
                return Intrinsics.f(index.name, index2.name);
            }
        }
        return false;
    }

    @NotNull
    public static final String toStringCommon(@NotNull TableInfo.ForeignKey foreignKey) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        StringBuilder sb6 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb6.append(foreignKey.referenceTable);
        sb6.append("',\n            |   onDelete = '");
        sb6.append(foreignKey.onDelete);
        sb6.append("',\n            |   onUpdate = '");
        sb6.append(foreignKey.onUpdate);
        sb6.append("',\n            |   columnNames = {");
        joinToStringMiddleWithIndent(zhm.d0.O0(foreignKey.columnNames));
        Unit unit = Unit.f186387a;
        sb6.append(unit);
        sb6.append("\n            |   referenceColumnNames = {");
        joinToStringEndWithIndent(zhm.d0.O0(foreignKey.referenceColumnNames));
        sb6.append(unit);
        sb6.append("\n            |}\n        ");
        return t.b(t.f(sb6.toString()), "    ");
    }

    @NotNull
    public static final String toStringCommon(@NotNull TableInfo.Index index) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        StringBuilder sb6 = new StringBuilder("\n            |Index {\n            |   name = '");
        sb6.append(index.name);
        sb6.append("',\n            |   unique = '");
        sb6.append(index.unique);
        sb6.append("',\n            |   columns = {");
        joinToStringMiddleWithIndent(index.columns);
        Unit unit = Unit.f186387a;
        sb6.append(unit);
        sb6.append("\n            |   orders = {");
        joinToStringEndWithIndent(index.orders);
        sb6.append(unit);
        sb6.append("\n            |}\n        ");
        return t.b(t.f(sb6.toString()), "    ");
    }
}
