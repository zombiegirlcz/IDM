package net.zetetic.database;

import java.util.Locale;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes14.dex */
public class DatabaseUtils {

    @Deprecated
    public static class InsertHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SQLiteDatabase f214670a;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.f214670a = sQLiteDatabase;
        }
    }

    public static int a(String str) {
        String strTrim = str.trim();
        if (strTrim.length() < 3) {
            return 99;
        }
        String upperCase = strTrim.substring(0, 3).toUpperCase(Locale.ROOT);
        if (upperCase.equals("SEL")) {
            return 1;
        }
        if (upperCase.equals("INS") || upperCase.equals("UPD") || upperCase.equals("REP") || upperCase.equals("DEL")) {
            return 2;
        }
        if (upperCase.equals("ATT")) {
            return 3;
        }
        if (upperCase.equals("COM") || upperCase.equals("END")) {
            return 5;
        }
        if (upperCase.equals("ROL")) {
            return 6;
        }
        if (upperCase.equals("BEG")) {
            return 4;
        }
        if (upperCase.equals("PRA")) {
            return 7;
        }
        if (upperCase.equals("CRE") || upperCase.equals("DRO") || upperCase.equals("ALT")) {
            return 8;
        }
        return (upperCase.equals("ANA") || upperCase.equals("DET")) ? 9 : 99;
    }

    public static int b(Object obj2) {
        if (obj2 == null) {
            return 0;
        }
        if (obj2 instanceof byte[]) {
            return 4;
        }
        if ((obj2 instanceof Float) || (obj2 instanceof Double)) {
            return 2;
        }
        return ((obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Short) || (obj2 instanceof Byte)) ? 1 : 3;
    }
}
