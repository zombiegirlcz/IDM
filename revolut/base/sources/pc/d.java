package pc;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.SplitInstallException;
import wc.q;

/* JADX INFO: loaded from: classes16.dex */
public abstract class d extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234758a;

    public /* synthetic */ d(int i) {
        this.f234758a = i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f234758a;
        return this;
    }

    public abstract boolean k(int i, Parcel parcel);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f234758a) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                oc.h hVar = (oc.h) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i3 = e.f234759a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(a0.d.n("Parcel data not fully consumed, unread size: ", iDataAvail));
                    }
                    hVar.a(bundle);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i5 = e.f234759a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(a0.d.n("Parcel data not fully consumed, unread size: ", iDataAvail2));
                    }
                    hVar.i(bundle2);
                }
                return true;
            case 1:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                vc.h hVar2 = (vc.h) this;
                TaskCompletionSource taskCompletionSource = hVar2.f287585b;
                vc.i iVar = hVar2.e;
                switch (i) {
                    case 2:
                        int i6 = parcel.readInt();
                        Parcelable.Creator creator3 = Bundle.CREATOR;
                        Bundle bundle3 = (Bundle) q.a(parcel);
                        q.b(parcel);
                        hVar2.j(i6, bundle3);
                        break;
                    case 3:
                        int i21 = parcel.readInt();
                        Parcelable.Creator creator4 = Bundle.CREATOR;
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        vc.i.f287586c.e("onCompleteInstall(%d)", Integer.valueOf(i21));
                        break;
                    case 4:
                        int i22 = parcel.readInt();
                        Parcelable.Creator creator5 = Bundle.CREATOR;
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        vc.i.f287586c.e("onCancelInstall(%d)", Integer.valueOf(i22));
                        break;
                    case 5:
                        int i32 = parcel.readInt();
                        Parcelable.Creator creator6 = Bundle.CREATOR;
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        vc.i.f287586c.e("onGetSession(%d)", Integer.valueOf(i32));
                        break;
                    case 6:
                        Parcelable.Creator creator7 = Bundle.CREATOR;
                        Bundle bundle4 = (Bundle) q.a(parcel);
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        int i33 = bundle4.getInt("error_code");
                        vc.i.f287586c.c("onError(%d)", Integer.valueOf(i33));
                        taskCompletionSource.trySetException(new SplitInstallException(i33));
                        break;
                    case 7:
                        parcel.createTypedArrayList(Bundle.CREATOR);
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        vc.i.f287586c.e("onGetSessionStates", new Object[0]);
                        break;
                    case 8:
                        Parcelable.Creator creator8 = Bundle.CREATOR;
                        Bundle bundle5 = (Bundle) q.a(parcel);
                        q.b(parcel);
                        hVar2.g(bundle5);
                        break;
                    case 9:
                        Parcelable.Creator creator9 = Bundle.CREATOR;
                        Bundle bundle6 = (Bundle) q.a(parcel);
                        q.b(parcel);
                        hVar2.a(bundle6);
                        break;
                    case 10:
                        Parcelable.Creator creator10 = Bundle.CREATOR;
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        vc.i.f287586c.e("onGetSplitsForAppUpdate", new Object[0]);
                        break;
                    case 11:
                        Parcelable.Creator creator11 = Bundle.CREATOR;
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        vc.i.f287586c.e("onCompleteInstallForAppUpdate", new Object[0]);
                        break;
                    case 12:
                        Parcelable.Creator creator12 = Bundle.CREATOR;
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        vc.i.f287586c.e("onDeferredLanguageInstall", new Object[0]);
                        break;
                    case 13:
                        Parcelable.Creator creator13 = Bundle.CREATOR;
                        q.b(parcel);
                        iVar.f287588b.c(taskCompletionSource);
                        vc.i.f287586c.e("onDeferredLanguageUninstall", new Object[0]);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return k(i, parcel);
        }
    }

    public d(String str) {
        this.f234758a = 2;
        attachInterface(this, str);
    }
}
