package cm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.feature.navigation.hub.api.navigation.NavigationHubDestination;
import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$InputData;
import com.feature.user.details.api.UserDetailsToggles$ConfirmButtonUserDetails;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.feature.user.details.impl.ui.details.UserDetailsControllerContract$InputData;
import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$InputData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;
import com.meshconnect.link.ui.LinkExit;
import com.meshconnect.link.ui.LinkSuccess;
import com.onfido.android.sdk.capture.EnterpriseFeatures;
import com.onfido.android.sdk.capture.OnfidoTheme;
import com.onfido.workflow.internal.WorkflowConfigImpl;
import com.rd.draw.data.PositionSavedState;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25103a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25103a) {
            case 0:
                PositionSavedState positionSavedState = new PositionSavedState(parcel);
                positionSavedState.f50259a = parcel.readInt();
                positionSavedState.f50260b = parcel.readInt();
                positionSavedState.f50261c = parcel.readInt();
                return positionSavedState;
            case 1:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                Bundle bundleCreateBundle = null;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new RemoteMessage(bundleCreateBundle);
            case 2:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserDetailsControllerContract$InputData(parcel.readString());
            case 3:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigationHubDestination(parcel.readString());
            case 4:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserDetailsFlowContract$InputData(parcel.readString(), parcel.readString());
            case 5:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WorkflowConfigImpl(parcel.readString(), parcel.readString(), (Locale) parcel.readSerializable(), (EnterpriseFeatures) parcel.readParcelable(WorkflowConfigImpl.class.getClassLoader()), (ResultReceiver) parcel.readParcelable(WorkflowConfigImpl.class.getClassLoader()), (ResultReceiver) parcel.readParcelable(WorkflowConfigImpl.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (ResultReceiver) parcel.readParcelable(WorkflowConfigImpl.class.getClassLoader()), OnfidoTheme.valueOf(parcel.readString()));
            case 6:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigationHubFlowContract$InputData(parcel.readString());
            case 7:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkExit(parcel.readString());
            case 8:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(LinkSuccess.class, parcel, arrayList, iE, 1);
                }
                return new LinkSuccess(arrayList);
            case 9:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UserDetailsToggles$ConfirmButtonUserDetails.f26225c;
            default:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UserDetailsDestination.f26226a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f25103a) {
            case 0:
                return new PositionSavedState[i];
            case 1:
                return new RemoteMessage[i];
            case 2:
                return new UserDetailsControllerContract$InputData[i];
            case 3:
                return new NavigationHubDestination[i];
            case 4:
                return new UserDetailsFlowContract$InputData[i];
            case 5:
                return new WorkflowConfigImpl[i];
            case 6:
                return new NavigationHubFlowContract$InputData[i];
            case 7:
                return new LinkExit[i];
            case 8:
                return new LinkSuccess[i];
            case 9:
                return new UserDetailsToggles$ConfirmButtonUserDetails[i];
            default:
                return new UserDetailsDestination[i];
        }
    }
}
