package net.zetetic.database;

import a0.d;
import android.database.CursorIndexOutOfBoundsException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes14.dex */
public class MatrixCursor extends AbstractCursor {
    public final String[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object[] f214672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f214673m;

    public class RowBuilder {
    }

    public MatrixCursor(String[] strArr, int i) {
        this.k = strArr;
        int length = strArr.length;
        this.f214673m = length;
        this.f214672l = new Object[length * (i < 1 ? 1 : i)];
    }

    @Override // net.zetetic.database.AbstractCursor
    public final void f(int i) {
    }

    public final Object get(int i) {
        int i2 = this.f214673m;
        if (i < 0 || i >= i2) {
            throw new CursorIndexOutOfBoundsException(d.g(i, i2, "Requested column: ", ", # of columns: "));
        }
        int i3 = this.f214661a;
        if (i3 < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        }
        if (i3 >= 0) {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
        return this.f214672l[(i3 * i2) + i];
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.k;
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return 0;
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        Object obj2 = get(i);
        if (obj2 == null) {
            return 0.0d;
        }
        return obj2 instanceof Number ? ((Number) obj2).doubleValue() : Double.parseDouble(obj2.toString());
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        Object obj2 = get(i);
        return obj2 == null ? BitmapDescriptorFactory.HUE_RED : obj2 instanceof Number ? ((Number) obj2).floatValue() : Float.parseFloat(obj2.toString());
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        Object obj2 = get(i);
        if (obj2 == null) {
            return 0;
        }
        return obj2 instanceof Number ? ((Number) obj2).intValue() : Integer.parseInt(obj2.toString());
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        Object obj2 = get(i);
        if (obj2 == null) {
            return 0L;
        }
        return obj2 instanceof Number ? ((Number) obj2).longValue() : Long.parseLong(obj2.toString());
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        Object obj2 = get(i);
        if (obj2 == null) {
            return (short) 0;
        }
        return obj2 instanceof Number ? ((Number) obj2).shortValue() : Short.parseShort(obj2.toString());
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        Object obj2 = get(i);
        if (obj2 == null) {
            return null;
        }
        return obj2.toString();
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return DatabaseUtils.b(get(i));
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return get(i) == null;
    }

    public MatrixCursor(String[] strArr) {
        this(strArr, 16);
    }
}
