package com.google.common.escape;

import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49239b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f49238a = i;
        this.f49239b = obj2;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f49238a) {
            case 0:
                return ((Escaper) this.f49239b).escape((String) obj2);
            default:
                return ((FragmentedMp4Extractor) this.f49239b).modifyTrack((Track) obj2);
        }
    }
}
