package androidx.credentials.playservices;

import android.content.Context;
import android.graphics.Point;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import androidx.credentials.CredentialManagerCallback;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.gms.tasks.OnFailureListener;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import efm.e0;
import efm.g0;
import efm.u;
import fa1.k;
import h93.f0;
import ja3.f;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sa1.s;
import ta1.f;
import ta1.g;
import tfm.z0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements OnFailureListener, u, g0, ITaskMonitor, DefaultTrackSelector.TrackInfo.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7368c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f7366a = obj2;
        this.f7367b = obj3;
        this.f7368c = obj4;
        this.d = obj5;
    }

    @Override // efm.u
    public void a(z0 emitter) {
        f fVar = (f) this.f7366a;
        UrlImage urlImage = (UrlImage) this.f7367b;
        f0 f0Var = (f0) this.f7368c;
        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) this.d;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        yy0.f fVar2 = fVar.d;
        Context context = fVar.f172422c;
        int iB = fVar.b();
        int iA = fVar.a();
        ja3.d dVar = new ja3.d(fVar, f0Var, cardDetailsDesignConfig, emitter, 0);
        yy0.e eVar = yy0.f.Companion;
        fVar2.c(urlImage, context, iB, iA, dVar, null);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectVideoTrack$1((DefaultTrackSelector.Parameters) this.f7366a, (String) this.f7367b, (int[]) this.f7368c, (Point) this.d, i, trackGroup, iArr);
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        ta1.e eVar;
        RPCCommand rPCCommand = (RPCCommand) this.f7366a;
        z0 z0Var = (z0) this.f7367b;
        Function1 function1 = (Function1) this.f7368c;
        Function1 function12 = (Function1) this.d;
        int i = 0;
        Object obj2 = objArr[0];
        Intrinsics.i(obj2, "null cannot be cast to non-null type COMMAND of com.revolut.feature.acquiring.card_reader.data.impl.domain.sdk_adapter.UCubeExtensionsKt.execute");
        RPCCommandStatus state = ((RPCCommand) obj2).getState();
        String simpleName = rPCCommand.getClass().getSimpleName();
        int i2 = taskEvent == null ? -1 : s.f261257b[taskEvent.ordinal()];
        if (i2 == 1) {
            z0Var.c(new ta1.c(null, (state != null ? s.f261256a[state.ordinal()] : -1) == 1 ? f.c.f269083a : f.b.f269082a));
            return;
        }
        if (i2 == 2) {
            z0Var.c(new ta1.c(null, f.a.f269081a));
            z0Var.a();
            return;
        }
        if (i2 == 3) {
            Object obj3 = objArr[0];
            Intrinsics.i(obj3, "null cannot be cast to non-null type COMMAND of com.revolut.feature.acquiring.card_reader.data.impl.domain.sdk_adapter.UCubeExtensionsKt.execute");
            Object objInvoke = function1.invoke((RPCCommand) obj3);
            function12.invoke(objInvoke);
            z0Var.c(new ta1.c(objInvoke, f.d.f269084a));
            z0Var.a();
            return;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj4 = objArr[0];
        Intrinsics.i(obj4, "null cannot be cast to non-null type COMMAND of com.revolut.feature.acquiring.card_reader.data.impl.domain.sdk_adapter.UCubeExtensionsKt.execute");
        short s2 = ((RPCCommand) obj4).getResponseStatus().cmdStatus;
        ea1.b.a(com.google.android.gms.internal.mlkit_vision_face.a.k(s2, simpleName, " is FAILED with error code: "), k.ERROR);
        ta1.e.Companion.getClass();
        ta1.e[] eVarArrValues = ta1.e.values();
        int length = eVarArrValues.length;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i];
            if (eVar.a() == s2) {
                break;
            } else {
                i++;
            }
        }
        if (eVar == null) {
            eVar = ta1.e.SOMETHING_WENT_WRONG;
        }
        z0Var.c(new ta1.c(null, new g(eVar)));
        z0Var.a();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc2) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$2((CredentialProviderPlayServicesImpl) this.f7366a, (CancellationSignal) this.f7367b, (Executor) this.f7368c, (CredentialManagerCallback) this.d, exc2);
    }

    @Override // efm.g0
    public void subscribe(e0 emitter) {
        PrintDocumentAdapter printDocumentAdapter = (PrintDocumentAdapter) this.f7366a;
        kgm.c cVar = (kgm.c) this.f7367b;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f7368c;
        File file = (File) this.d;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        printDocumentAdapter.onLayout(null, (PrintAttributes) cVar.f184018b, null, new l7a.a(printDocumentAdapter, parcelFileDescriptor, new l7a.b(parcelFileDescriptor, (ufm.a) emitter, file)), null);
    }
}
