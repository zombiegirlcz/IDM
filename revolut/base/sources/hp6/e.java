package hp6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lhp6/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getScore", "()I", "score", "", "b", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "tags", "c", "Ljava/lang/String;", "getComment", "comment", "Lhp6/e$a;", "d", "Lhp6/e$a;", "getContext", "()Lhp6/e$a;", "context", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("score")
    private final int score;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("context")
    private final a context;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lhp6/e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTransactionId", "transactionId", "b", "getCardId", "cardId", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("transactionId")
        private final String transactionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cardId")
        private final String cardId;

        public a() {
            this(null, null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.transactionId, aVar.transactionId) && Intrinsics.f(this.cardId, aVar.cardId);
        }

        public final int hashCode() {
            String str = this.transactionId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cardId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public a(String str, String str2) {
            this.transactionId = str;
            this.cardId = str2;
        }
    }

    public e(int i, List list, String str, a aVar) {
        this.score = i;
        this.tags = list;
        this.comment = str;
        this.context = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.score == eVar.score && Intrinsics.f(this.tags, eVar.tags) && Intrinsics.f(this.comment, eVar.comment) && Intrinsics.f(this.context, eVar.context);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.score) * 31;
        List<String> list = this.tags;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.comment;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.context;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
