package sl3;

import com.google.gson.reflect.TypeToken;
import efm.d0;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f264096c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.a f264097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f264098b;

    static {
        Type type = new TypeToken<Boolean>() { // from class: com.revolut.feature.contacts.impl.data.repository.ContactsPermissionRepository$Companion$BOOLEAN_TYPE_REFERENCE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f264096c = type;
    }

    public b(y80.a permissionProvider, xe0.e contactsStorage) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(contactsStorage, "contactsStorage");
        this.f264097a = permissionProvider;
        this.f264098b = contactsStorage;
    }

    public final ufm.i a() {
        d0 d0VarFirst = rd0.e.c(this.f264098b.C0("contacts_permission", f264096c), kotlin.coroutines.g.f186406a).map(new sk2.g(3, new sk2.f(15))).first(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        y80.a aVar = this.f264097a;
        ufm.i iVar = new ufm.i(new ufm.i(w.I0(d0VarFirst, aVar.e("android.permission.READ_CONTACTS"), aVar.e("android.permission.WRITE_CONTACTS")), new sk2.g(1, new sk2.f(14)), 1), new sk2.g(2, new scl.e(this, 28)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
