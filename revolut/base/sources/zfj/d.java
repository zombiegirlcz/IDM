package zfj;

import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322014a;

    static {
        int[] iArr = new int[EsimInstallationFlowDescriptor$Start.values().length];
        try {
            iArr[EsimInstallationFlowDescriptor$Start.InstallationPicker.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EsimInstallationFlowDescriptor$Start.DirectInstallation.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f322014a = iArr;
    }
}
