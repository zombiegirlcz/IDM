package t0m;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0m.f;
import z0m.j;

/* JADX INFO: loaded from: classes23.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f267053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f267054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f267055c;
    public final String[] d;
    public long e;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("com.fourthline.sdk", "namespace");
        this.f267053a = new ArrayList();
        this.d = new String[]{"id", "eventData", "dateCreated"};
        this.e = -1L;
        f.b(new g1m.f(this, context, 1));
    }

    public final boolean a() {
        SQLiteDatabase sQLiteDatabase = this.f267054b;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase != null ? sQLiteDatabase.isOpen() : false) {
                return true;
            }
        }
        return false;
    }

    public final void b(h1m.b payload) {
        SQLiteDatabase sQLiteDatabase;
        byte[] byteArray;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!a() || (sQLiteDatabase = this.f267054b) == null) {
            return;
        }
        HashMap map = payload.f148612b;
        Intrinsics.checkNotNullParameter(map, "map");
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), entry.getValue().toString());
        }
        Intrinsics.checkNotNullParameter(map2, "map");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map2);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            byteArray = null;
        }
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("eventData", byteArray);
        this.e = sQLiteDatabase.insert("events", null, contentValues);
        Intrinsics.checkNotNullExpressionValue("d", "TAG");
        j.a("d", "Added event to database: %s", Long.valueOf(this.e));
    }

    public final void c() {
        if (!a() || this.f267053a.size() <= 0) {
            return;
        }
        synchronized (this) {
            try {
                Iterator it8 = this.f267053a.iterator();
                while (it8.hasNext()) {
                    b((h1m.b) it8.next());
                }
                this.f267053a.clear();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
