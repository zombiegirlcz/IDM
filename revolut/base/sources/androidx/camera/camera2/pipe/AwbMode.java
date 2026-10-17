package androidx.camera.camera2.pipe;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/pipe/AwbMode;", "", "", "value", "constructor-impl", "(I)I", "", "isOn-impl", "(I)Z", "isOn", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getValue", "()I", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AwbMode {
    private static final int AUTO;
    private static final int CLOUDY_DAYLIGHT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DAYLIGHT;
    private static final int FLUORESCENT;
    private static final int INCANDESCENT;
    private static final int OFF;
    private static final int SHADE;
    private static final int TWILIGHT;

    @NotNull
    private static final List<AwbMode> values;
    private final int value;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/AwbMode$Companion;", "", "<init>", "()V", "", "value", "Landroidx/camera/camera2/pipe/AwbMode;", "fromIntOrNull--SaEiwI", "(I)Landroidx/camera/camera2/pipe/AwbMode;", "fromIntOrNull", "", "values", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: fromIntOrNull--SaEiwI, reason: not valid java name */
        public final AwbMode m101fromIntOrNullSaEiwI(int value) {
            Object next;
            Iterator<T> it8 = getValues().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((AwbMode) next).getValue() == value) {
                    break;
                }
            }
            return (AwbMode) next;
        }

        @NotNull
        public final List<AwbMode> getValues() {
            return AwbMode.values;
        }

        private Companion() {
        }
    }

    static {
        int iM95constructorimpl = m95constructorimpl(0);
        OFF = iM95constructorimpl;
        int iM95constructorimpl2 = m95constructorimpl(1);
        AUTO = iM95constructorimpl2;
        int iM95constructorimpl3 = m95constructorimpl(6);
        CLOUDY_DAYLIGHT = iM95constructorimpl3;
        int iM95constructorimpl4 = m95constructorimpl(5);
        DAYLIGHT = iM95constructorimpl4;
        int iM95constructorimpl5 = m95constructorimpl(2);
        INCANDESCENT = iM95constructorimpl5;
        int iM95constructorimpl6 = m95constructorimpl(3);
        FLUORESCENT = iM95constructorimpl6;
        int iM95constructorimpl7 = m95constructorimpl(8);
        SHADE = iM95constructorimpl7;
        int iM95constructorimpl8 = m95constructorimpl(7);
        TWILIGHT = iM95constructorimpl8;
        values = v.k(m94boximpl(iM95constructorimpl), m94boximpl(iM95constructorimpl2), m94boximpl(iM95constructorimpl3), m94boximpl(iM95constructorimpl4), m94boximpl(iM95constructorimpl5), m94boximpl(iM95constructorimpl6), m94boximpl(iM95constructorimpl7), m94boximpl(iM95constructorimpl8));
    }

    private /* synthetic */ AwbMode(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AwbMode m94boximpl(int i) {
        return new AwbMode(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m95constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m96equalsimpl(int i, Object obj2) {
        return (obj2 instanceof AwbMode) && i == ((AwbMode) obj2).getValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m97hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: isOn-impl, reason: not valid java name */
    public static final boolean m98isOnimpl(int i) {
        return i != 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m99toStringimpl(int i) {
        return a.k(CoreConstants.RIGHT_PARENTHESIS_CHAR, "AwbMode(value=", i);
    }

    public boolean equals(Object obj2) {
        return m96equalsimpl(this.value, obj2);
    }

    public int hashCode() {
        return m97hashCodeimpl(this.value);
    }

    public String toString() {
        return m99toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
