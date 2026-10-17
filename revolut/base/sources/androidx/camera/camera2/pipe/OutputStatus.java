package androidx.camera.camera2.pipe;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStatus;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getValue", "()I", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutputStatus {
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int PENDING = m252constructorimpl(0);
    private static final int AVAILABLE = m252constructorimpl(1);
    private static final int UNAVAILABLE = m252constructorimpl(2);
    private static final int ERROR_OUTPUT_FAILED = m252constructorimpl(10);
    private static final int ERROR_OUTPUT_ABORTED = m252constructorimpl(11);
    private static final int ERROR_OUTPUT_MISSING = m252constructorimpl(12);
    private static final int ERROR_OUTPUT_DROPPED = m252constructorimpl(13);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStatus$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStatus;", "AVAILABLE", "I", "getAVAILABLE-U7r42EA", "()I", "UNAVAILABLE", "getUNAVAILABLE-U7r42EA", "ERROR_OUTPUT_FAILED", "getERROR_OUTPUT_FAILED-U7r42EA", "ERROR_OUTPUT_ABORTED", "getERROR_OUTPUT_ABORTED-U7r42EA", "ERROR_OUTPUT_MISSING", "getERROR_OUTPUT_MISSING-U7r42EA", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAVAILABLE-U7r42EA, reason: not valid java name */
        public final int m257getAVAILABLEU7r42EA() {
            return OutputStatus.AVAILABLE;
        }

        /* JADX INFO: renamed from: getERROR_OUTPUT_ABORTED-U7r42EA, reason: not valid java name */
        public final int m258getERROR_OUTPUT_ABORTEDU7r42EA() {
            return OutputStatus.ERROR_OUTPUT_ABORTED;
        }

        /* JADX INFO: renamed from: getERROR_OUTPUT_FAILED-U7r42EA, reason: not valid java name */
        public final int m259getERROR_OUTPUT_FAILEDU7r42EA() {
            return OutputStatus.ERROR_OUTPUT_FAILED;
        }

        /* JADX INFO: renamed from: getERROR_OUTPUT_MISSING-U7r42EA, reason: not valid java name */
        public final int m260getERROR_OUTPUT_MISSINGU7r42EA() {
            return OutputStatus.ERROR_OUTPUT_MISSING;
        }

        /* JADX INFO: renamed from: getUNAVAILABLE-U7r42EA, reason: not valid java name */
        public final int m261getUNAVAILABLEU7r42EA() {
            return OutputStatus.UNAVAILABLE;
        }

        private Companion() {
        }
    }

    private /* synthetic */ OutputStatus(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OutputStatus m251boximpl(int i) {
        return new OutputStatus(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m252constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m253equalsimpl(int i, Object obj2) {
        return (obj2 instanceof OutputStatus) && i == ((OutputStatus) obj2).getValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m254hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m255toStringimpl(int i) {
        if (i == 0) {
            return "PENDING";
        }
        if (i == 1) {
            return "AVAILABLE";
        }
        if (i == 2) {
            return "UNAVAILABLE";
        }
        switch (i) {
            case 10:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return a.k(CoreConstants.RIGHT_PARENTHESIS_CHAR, "OutputStatus(value=", i);
        }
    }

    public boolean equals(Object obj2) {
        return m253equalsimpl(this.value, obj2);
    }

    public int hashCode() {
        return m254hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m255toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
