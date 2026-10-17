package p2m;

import androidx.lifecycle.ViewModel;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends ViewModel {

    @NotNull
    public static final f Companion = new f();
    public final w1m.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f232548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f232549m;

    public g(w1m.g idDocumentType) {
        int i;
        int i2;
        f fVar = Companion;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(idDocumentType, "idDocumentType");
        int[] iArr = e.f232547a;
        switch (iArr[idDocumentType.ordinal()]) {
            case 1:
                i = R.drawable.tdcoreekyc__id_type_drivers_license;
                break;
            case 2:
            case 3:
                i = R.drawable.tdcoreekyc__id_type_residence_card;
                break;
            case 4:
                i = R.drawable.tdcoreekyc__id_type_individual_number_card;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                Intrinsics.checkNotNullParameter("An operation is not implemented: 未対応の身分証画像", "message");
                throw new NotImplementedError("An operation is not implemented: 未対応の身分証画像");
            default:
                throw new NoWhenBranchMatchedException();
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(idDocumentType, "idDocumentType");
        switch (iArr[idDocumentType.ordinal()]) {
            case 1:
                i2 = R.string.tdcoreekyc__nfcDocSelect_idType_driversLicense;
                break;
            case 2:
            case 3:
                i2 = R.string.tdcoreekyc__nfcDocSelect_idType_residenceCardSPRC;
                break;
            case 4:
                i2 = R.string.tdcoreekyc__nfcDocSelect_idType_myNumberCard;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                Intrinsics.checkNotNullParameter("An operation is not implemented: 未対応の身分証", "message");
                throw new NotImplementedError("An operation is not implemented: 未対応の身分証");
            default:
                throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(idDocumentType, "idDocumentType");
        this.k = idDocumentType;
        this.f232548l = i;
        this.f232549m = i2;
    }
}
