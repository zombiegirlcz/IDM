package jv0;

import android.content.Context;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultTrackSelector f178740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f178741b;

    public g(Context context) {
        DefaultTrackSelector wrappedSelector = new DefaultTrackSelector(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrappedSelector, "wrappedSelector");
        this.f178740a = wrappedSelector;
        this.f178741b = new f();
    }

    public static Integer c(MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        Object next;
        vim.f it8 = kotlin.ranges.f.o(0, mappedTrackInfo.getRendererCount()).iterator();
        while (true) {
            if (!it8.f289625c) {
                next = null;
                break;
            }
            next = it8.next();
            if (mappedTrackInfo.getRendererType(((Number) next).intValue()) == 3) {
                break;
            }
        }
        return (Integer) next;
    }

    public final List a() {
        Integer numC;
        ArrayList arrayList;
        DefaultTrackSelector defaultTrackSelector = this.f178740a;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = defaultTrackSelector.getCurrentMappedTrackInfo();
        if (currentMappedTrackInfo == null || (numC = c(currentMappedTrackInfo)) == null) {
            arrayList = null;
        } else {
            TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(numC.intValue());
            int i = trackGroups.length;
            arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(trackGroups.get(i2));
            }
        }
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                nkm.h hVarN = nkm.y.n(nkm.y.x(nkm.y.o(nkm.y.y(d0.Q(arrayList), new akg.d(23)), new jli.f(1)), new jli.f(2)), new akl.s(this, 20));
                MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo2 = defaultTrackSelector.getCurrentMappedTrackInfo();
                return nkm.y.J(nkm.y.x(hVarN, new akl.s(this, currentMappedTrackInfo2 != null ? b(currentMappedTrackInfo2) : null)));
            }
        }
        return null;
    }

    public final Integer b(MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        Integer numC = c(mappedTrackInfo);
        if (numC == null) {
            return null;
        }
        int iIntValue = numC.intValue();
        TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(iIntValue);
        Intrinsics.checkNotNullExpressionValue(trackGroups, "getTrackGroups(...)");
        DefaultTrackSelector.SelectionOverride selectionOverride = this.f178740a.getParameters().getSelectionOverride(iIntValue, trackGroups);
        if (selectionOverride != null) {
            return Integer.valueOf(selectionOverride.groupIndex);
        }
        return null;
    }

    public final void d(int i) {
        Integer numC;
        DefaultTrackSelector defaultTrackSelector = this.f178740a;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = defaultTrackSelector.getCurrentMappedTrackInfo();
        if (currentMappedTrackInfo == null || (numC = c(currentMappedTrackInfo)) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(iIntValue);
        Intrinsics.checkNotNullExpressionValue(trackGroups, "getTrackGroups(...)");
        defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setRendererDisabled(iIntValue, false).setSelectionOverride(iIntValue, trackGroups, new DefaultTrackSelector.SelectionOverride(i, 0)));
    }

    public final void e(List preferredLanguages) {
        List tracks;
        Intrinsics.checkNotNullParameter(preferredLanguages, "languages");
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = this.f178740a.getCurrentMappedTrackInfo();
        Object obj2 = null;
        if ((currentMappedTrackInfo != null ? b(currentMappedTrackInfo) : null) == null && (tracks = a()) != null) {
            f fVar = this.f178741b;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(preferredLanguages, "preferredLanguages");
            Intrinsics.checkNotNullParameter(tracks, "tracks");
            nkm.d0 d0VarX = nkm.y.x(d0.Q(preferredLanguages), new jp3.b(fVar, tracks, 20));
            Iterator it8 = d0VarX.f216835a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object objInvoke = d0VarX.f216836b.invoke(it8.next());
                if (((pz0.a) objInvoke) != null) {
                    obj2 = objInvoke;
                    break;
                }
            }
            pz0.a aVar = (pz0.a) obj2;
            if (aVar == null) {
                return;
            }
            d(aVar.a());
        }
    }
}
