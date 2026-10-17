package com.onfido.android.sdk.capture.internal.nfc;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import com.onfido.android.sdk.capture.internal.nfc.NfcService;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements NfcAdapter.ReaderCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49958b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f49957a = i;
        this.f49958b = obj2;
    }

    @Override // android.nfc.NfcAdapter.ReaderCallback
    public final void onTagDiscovered(Tag tag2) {
        switch (this.f49957a) {
            case 0:
                NfcService.AnonymousClass1.invokeSuspend$lambda$0((ProducerScope) this.f49958b, tag2);
                break;
            default:
                NfcInteractorImpl.enableReaderMode$lambda$0((Function1) this.f49958b, tag2);
                break;
        }
    }
}
