package wf6;

import com.revolut.domain.models.openbanking.ObaClient$AuthorizationFlow;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296975a;

    static {
        int[] iArr = new int[ObaClient$AuthorizationFlow.values().length];
        try {
            iArr[ObaClient$AuthorizationFlow.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ObaClient$AuthorizationFlow.PUSHED_AUTHORISATION_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f296975a = iArr;
    }
}
