package com.google.common.net;

import android.os.Bundle;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.text.Cue;
import androidx.media3.exoplayer.source.TrackGroupArray;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMultiset;
import java.util.Collection;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49293a;

    public /* synthetic */ a(int i) {
        this.f49293a = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f49293a) {
            case 0:
                return MediaType.lambda$computeToString$0((String) obj2);
            case 1:
                return ImmutableMultiset.copyOf((Collection) obj2);
            case 2:
                return Format.lambda$toLogString$0((Label) obj2);
            case 3:
                return Cue.fromBundle((Bundle) obj2);
            case 4:
                return ((Cue) obj2).toSerializableBundle();
            default:
                return TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj2);
        }
    }
}
