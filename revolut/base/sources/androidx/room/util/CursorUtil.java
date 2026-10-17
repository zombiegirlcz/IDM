package androidx.room.util;

import android.database.Cursor;
import android.database.MatrixCursor;
import com.bumptech.glide.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroid/database/Cursor;", "c", "copyAndClose", "(Landroid/database/Cursor;)Landroid/database/Cursor;", "", "name", "", "getColumnIndex", "(Landroid/database/Cursor;Ljava/lang/String;)I", "getColumnIndexOrThrow", "cursor", "findColumnIndexBySuffix", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class CursorUtil {
    @NotNull
    public static final Cursor copyAndClose(@NotNull Cursor c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c2.getColumnNames(), c2.getCount());
            while (c2.moveToNext()) {
                Object[] objArr = new Object[c2.getColumnCount()];
                int columnCount = c2.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = c2.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(c2.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(c2.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = c2.getString(i);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i] = c2.getBlob(i);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            d.e(c2, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        return -1;
    }

    public static final int getColumnIndex(@NotNull Cursor c2, @NotNull String name) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c2.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c2.getColumnIndex("`" + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c2, name);
    }

    public static final int getColumnIndexOrThrow(@NotNull Cursor c2, @NotNull String name) {
        String strD0;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = getColumnIndex(c2, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c2.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "getColumnNames(...)");
            strD0 = kotlin.collections.d.d0(columnNames, null, null, null, null, 63);
        } catch (Exception e) {
            strD0 = "unknown";
        }
        throw new IllegalArgumentException(a0.d.s("column '", name, "' does not exist. Available columns: ", strD0));
    }
}
