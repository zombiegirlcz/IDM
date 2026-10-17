package kmi;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import androidx.view.ComponentActivity;
import ard.h0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f185894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ogm.i f185895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NfcAdapter f185896c;
    public boolean d;
    public h0 e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ara.c f185897g;

    /* JADX WARN: Type inference failed for: r2v1, types: [kmi.d] */
    public g(ComponentActivity activity, ogm.i nfcAdapterProvider) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(nfcAdapterProvider, "nfcAdapterProvider");
        this.f185894a = activity;
        this.f185895b = nfcAdapterProvider;
        this.f = new NfcAdapter.ReaderCallback() { // from class: kmi.d
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag2) {
                h0 h0Var = this.f185891a.e;
                if (h0Var != null) {
                    Intrinsics.h(tag2);
                    h0Var.invoke(tag2);
                }
            }
        };
        this.f185897g = new ara.c(this, 1);
    }

    public final void a() {
        NfcAdapter nfcAdapterB = b();
        if (nfcAdapterB != null) {
            boolean z = this.d;
            ComponentActivity componentActivity = this.f185894a;
            if (z) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "NfcDelegate", m72.b.r("Enabling reader mode in ", o0.f186429a.b(componentActivity.getClass())), null, null, 16);
                nfcAdapterB.enableReaderMode(componentActivity, this.f, ISO781611.CREATION_DATE_AND_TIME_TAG, null);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "NfcDelegate", m72.b.r("Disabling reader mode in ", o0.f186429a.b(componentActivity.getClass())), null, null, 16);
            nfcAdapterB.disableReaderMode(componentActivity);
        }
    }

    public final NfcAdapter b() {
        Object objA;
        NfcAdapter nfcAdapter = this.f185896c;
        if (nfcAdapter != null) {
            return nfcAdapter;
        }
        ogm.i iVar = this.f185895b;
        try {
            m.Companion companion = m.INSTANCE;
            objA = NfcAdapter.getDefaultAdapter((ComponentActivity) iVar.f225222b);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        NfcAdapter nfcAdapter2 = (NfcAdapter) objA;
        if (nfcAdapter2 == null) {
            return null;
        }
        this.f185896c = nfcAdapter2;
        return nfcAdapter2;
    }
}
