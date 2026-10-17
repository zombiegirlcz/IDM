package androidx.compose.foundation.text.contextmenu.data;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/ProcessTextKey;", "", "", "id", "<init>", "(I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getId", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessTextKey {
    private final int id;

    public ProcessTextKey(int i) {
        this.id = i;
    }

    public boolean equals(Object other) {
        return (other instanceof ProcessTextKey) && this.id == ((ProcessTextKey) other).id;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getId() {
        return this.id;
    }
}
