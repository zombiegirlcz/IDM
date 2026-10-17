package xe0;

import android.content.Context;
import java.lang.reflect.Type;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    @NotNull
    public static final d Companion = new d(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je0.b f304517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String fileName, je0.d mapper, xql.a migrator, qm.e encryptionProvider, ye0.b storageSizeChecker) {
        super(context, fileName, migrator, encryptionProvider, storageSizeChecker);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(migrator, "migrator");
        Intrinsics.checkNotNullParameter(encryptionProvider, "encryptionProvider");
        Intrinsics.checkNotNullParameter(storageSizeChecker, "storageSizeChecker");
        this.f304517b = mapper;
    }

    @Override // ue0.c
    public final void G(Object value, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        String str = (String) this.f304517b.c(value, type);
        ij.e eVarEdit = a().edit();
        eVarEdit.g(key, str);
        if (eVarEdit.commit()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("putSync(", key, ") - value wasn't stored"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "javaClass", null, illegalStateException, h0Var);
    }

    @Override // xe0.c, ue0.c
    public final boolean I0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean zI0 = super.I0(key);
        if (!zI0) {
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("removeSync(", key, ") - value wasn't removed"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "javaClass", null, illegalStateException, h0Var);
        }
        return zI0;
    }

    @Override // ue0.c
    public final Object T2(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        String string = a().getString(key, null);
        if (string != null) {
            boolean zW = d0.W(string);
            if (zW) {
                IllegalStateException illegalStateException = new IllegalStateException(p.a.p("getSync(", key, ") - value is blank"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "javaClass", null, illegalStateException, h0Var);
            }
            if (zW) {
                string = null;
            }
            if (string != null) {
                return this.f304517b.b(string, type);
            }
        }
        return null;
    }

    @Override // xe0.c, ue0.c
    public final Object v0(Object obj2, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "default");
        return super.v0(obj2, key, type);
    }
}
