package com.onfido.android.sdk.capture.antifraud;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/antifraud/SignalExtractor;", "", "signalFactory", "Lcom/onfido/android/sdk/capture/antifraud/SignalFactory;", "(Lcom/onfido/android/sdk/capture/antifraud/SignalFactory;)V", "extract", "Lcom/onfido/android/sdk/capture/antifraud/SignalHolder;", "signalSet", "Lcom/onfido/android/sdk/capture/antifraud/SignalSet;", "signals", "", "Lcom/onfido/android/sdk/capture/antifraud/Signal;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SignalExtractor {

    @NotNull
    private final SignalFactory signalFactory;

    public SignalExtractor(@NotNull SignalFactory signalFactory) {
        Intrinsics.checkNotNullParameter(signalFactory, "signalFactory");
        this.signalFactory = signalFactory;
    }

    @NotNull
    public final SignalHolder extract(@NotNull SignalSet signalSet) {
        Intrinsics.checkNotNullParameter(signalSet, "signalSet");
        return extract(d.v0(signalSet.getSignals()));
    }

    @NotNull
    public final SignalHolder extract(@NotNull List<? extends Signal> signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        SignalFactory signalFactory = this.signalFactory;
        ArrayList arrayList = new ArrayList(w.t(signals, 10));
        Iterator<T> it8 = signals.iterator();
        while (it8.hasNext()) {
            arrayList.add(signalFactory.extractSignal((Signal) it8.next()));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((ExtractedSignal) obj2).getSignalName())) {
                arrayList2.add(obj2);
            }
        }
        return new SignalHolder(d0.i1(arrayList2));
    }
}
