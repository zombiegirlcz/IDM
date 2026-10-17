package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.Lock3ABehavior;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u0001H\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\b\u001a\u0013\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\n\u001a\u0013\u0010\u000b\u001a\u00020\u0001*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\f\u001a\u0013\u0010\r\u001a\u00020\u0001*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0001*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0001*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"isNullOrIn", "", "T", "collection", "", "(Ljava/lang/Object;Ljava/util/Collection;)Z", "shouldUnlockAe", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "shouldUnlockAe-t6FjEyI", "shouldUnlockAf", "shouldUnlockAf-t6FjEyI", "shouldUnlockAwb", "shouldUnlockAwb-t6FjEyI", "shouldWaitForAeToConverge", "shouldWaitForAeToConverge-t6FjEyI", "shouldWaitForAwbToConverge", "shouldWaitForAwbToConverge-t6FjEyI", "shouldWaitForAfToConverge", "shouldWaitForAfToConverge-t6FjEyI", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class Controller3AKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean isNullOrIn(T t2, Collection<? extends T> collection) {
        if (t2 != null) {
            return collection.contains(t2);
        }
        return true;
    }

    /* JADX INFO: renamed from: shouldUnlockAe-t6FjEyI, reason: not valid java name */
    public static final boolean m455shouldUnlockAet6FjEyI(Lock3ABehavior lock3ABehavior) {
        int iM242getAFTER_NEW_SCANhRqSH3k = Lock3ABehavior.INSTANCE.m242getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return Lock3ABehavior.m237equalsimpl0(lock3ABehavior.getValue(), iM242getAFTER_NEW_SCANhRqSH3k);
    }

    /* JADX INFO: renamed from: shouldUnlockAf-t6FjEyI, reason: not valid java name */
    public static final boolean m456shouldUnlockAft6FjEyI(Lock3ABehavior lock3ABehavior) {
        int iM242getAFTER_NEW_SCANhRqSH3k = Lock3ABehavior.INSTANCE.m242getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return Lock3ABehavior.m237equalsimpl0(lock3ABehavior.getValue(), iM242getAFTER_NEW_SCANhRqSH3k);
    }

    /* JADX INFO: renamed from: shouldUnlockAwb-t6FjEyI, reason: not valid java name */
    public static final boolean m457shouldUnlockAwbt6FjEyI(Lock3ABehavior lock3ABehavior) {
        int iM242getAFTER_NEW_SCANhRqSH3k = Lock3ABehavior.INSTANCE.m242getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return Lock3ABehavior.m237equalsimpl0(lock3ABehavior.getValue(), iM242getAFTER_NEW_SCANhRqSH3k);
    }

    /* JADX INFO: renamed from: shouldWaitForAeToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m458shouldWaitForAeToConverget6FjEyI(Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !Lock3ABehavior.m237equalsimpl0(lock3ABehavior.getValue(), Lock3ABehavior.INSTANCE.m243getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    /* JADX INFO: renamed from: shouldWaitForAfToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m459shouldWaitForAfToConverget6FjEyI(Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !Lock3ABehavior.m237equalsimpl0(lock3ABehavior.getValue(), Lock3ABehavior.INSTANCE.m243getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    /* JADX INFO: renamed from: shouldWaitForAwbToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m460shouldWaitForAwbToConverget6FjEyI(Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !Lock3ABehavior.m237equalsimpl0(lock3ABehavior.getValue(), Lock3ABehavior.INSTANCE.m243getIMMEDIATEhRqSH3k());
        }
        return false;
    }
}
