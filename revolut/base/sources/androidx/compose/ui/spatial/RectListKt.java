package androidx.compose.ui.spatial;

import kotlin.Metadata;
import yhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\t\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"", "EverythingButLastChildOffset", "J", "getEverythingButLastChildOffset", "()J", "EverythingButParentId", "getEverythingButParentId", "TombStone", "getTombStone", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class RectListKt {
    private static final long EverythingButLastChildOffset;
    private static final long EverythingButParentId;
    private static final long TombStone;

    static {
        w.Companion companion = w.INSTANCE;
        EverythingButLastChildOffset = (((long) 1023) << 50) ^ (-1);
        EverythingButParentId = (-1) ^ (((long) 33554431) << 25);
        long j2 = 33554431;
        TombStone = j2 | (((long) Math.min(0, 1023)) << 50) | (j2 << 25);
    }

    public static final long getEverythingButLastChildOffset() {
        return EverythingButLastChildOffset;
    }

    public static final long getEverythingButParentId() {
        return EverythingButParentId;
    }

    public static final long getTombStone() {
        return TombStone;
    }
}
