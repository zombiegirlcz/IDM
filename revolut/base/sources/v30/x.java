package v30;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0012"}, d2 = {"Lv30/x;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "authMethodHash", "b", "getClientId", "clientId", "e", "revolutTokenHash", "d", "authMethodChatToken", "chatToken", "Companion", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("authMethodHash")
    private final String authMethodHash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientId")
    private final String clientId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("revolutToken")
    private final String revolutTokenHash;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("authMethodChatToken")
    private final String authMethodChatToken;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("chatToken")
    private final String chatToken;

    /* JADX INFO: renamed from: v30.x$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void a(ue0.c storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            storage.I0("CHAT_USER_TOKEN_STORAGE_KEY");
        }

        public static x b(ue0.c storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            x xVar = (x) storage.T2("CHAT_USER_TOKEN_STORAGE_KEY", x.class);
            return xVar == null ? new x(0) : xVar;
        }
    }

    public x() {
        this(0);
    }

    public static x a(x xVar, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 1) != 0) {
            str = xVar.authMethodHash;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = xVar.clientId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = xVar.revolutTokenHash;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = xVar.authMethodChatToken;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = xVar.chatToken;
        }
        return new x(str6, str7, str8, str9, str5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAuthMethodChatToken() {
        return this.authMethodChatToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAuthMethodHash() {
        return this.authMethodHash;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getChatToken() {
        return this.chatToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRevolutTokenHash() {
        return this.revolutTokenHash;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.authMethodHash, xVar.authMethodHash) && Intrinsics.f(this.clientId, xVar.clientId) && Intrinsics.f(this.revolutTokenHash, xVar.revolutTokenHash) && Intrinsics.f(this.authMethodChatToken, xVar.authMethodChatToken) && Intrinsics.f(this.chatToken, xVar.chatToken);
    }

    public final void f(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        storage.G(this, "CHAT_USER_TOKEN_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.b(x.class)));
    }

    public final int hashCode() {
        String str = this.authMethodHash;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.revolutTokenHash;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.authMethodChatToken;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chatToken;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public /* synthetic */ x(int i) {
        this(null, null, null, null, null);
    }

    public x(String str, String str2, String str3, String str4, String str5) {
        this.authMethodHash = str;
        this.clientId = str2;
        this.revolutTokenHash = str3;
        this.authMethodChatToken = str4;
        this.chatToken = str5;
    }
}
