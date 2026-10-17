package sl3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.contacts.impl.data.network.UserService;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rfm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class u {

    @NotNull
    private static final t Companion = new t();
    public static final Type f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ml3.q f264132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ml3.s f264133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserService f264134c;
    public final xe0.e d;
    public final w4l.f e;

    static {
        Type type = new TypeToken<Long>() { // from class: com.revolut.feature.contacts.impl.data.repository.RemoteContactsRepositoryImpl$Companion$LONG_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f = type;
    }

    public u(ml3.q remoteContactsDao, ml3.s remoteContactsExtraDao, UserService userService, xe0.e contactsStorage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(remoteContactsDao, "remoteContactsDao");
        Intrinsics.checkNotNullParameter(remoteContactsExtraDao, "remoteContactsExtraDao");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(contactsStorage, "contactsStorage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f264132a = remoteContactsDao;
        this.f264133b = remoteContactsExtraDao;
        this.f264134c = userService;
        this.d = contactsStorage;
        this.e = new w4l.f(new scl.h(this, 15), null, null, null, null, null, null, null, 254);
    }

    public final w a(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        efm.k kVarC = this.f264132a.c(code);
        r rVar = new r(new sdi.k(this, code, 8), 4);
        kVarC.getClass();
        rfm.m mVar = new rfm.m(kVarC, rVar, 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return te0.w.h0(mVar);
    }

    public final efm.r b() {
        return this.f264133b.f().map(new r(new i(4), 2));
    }
}
