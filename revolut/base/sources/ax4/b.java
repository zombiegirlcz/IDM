package ax4;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5l.c f10856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f10857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f10858c;
    public final Set d;
    public final Map e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f10859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f10860h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f10861j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f10862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f10863m;

    public b() {
        this(0);
    }

    public static b a(b bVar, p5l.c cVar, LinkedHashSet linkedHashSet, Map map, Set set, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, Map map10, int i) {
        if ((i & 1) != 0) {
            cVar = bVar.f10856a;
        }
        p5l.c cardsConfig = cVar;
        Set expandedItemsIds = (i & 2) != 0 ? bVar.f10857b : linkedHashSet;
        Map checkedBoxIdsToStates = (i & 4) != 0 ? bVar.f10858c : map;
        Set acceptedDocumentsItemsIds = (i & 8) != 0 ? bVar.d : set;
        Map inputIdsToSingleSelectorValues = (i & 16) != 0 ? bVar.e : map2;
        Map inputIdsToMaskedTexts = (i & 32) != 0 ? bVar.f : map3;
        Map inputIdsToTexts = (i & 64) != 0 ? bVar.f10859g : map4;
        Map inputIdsToDates = (i & 128) != 0 ? bVar.f10860h : map5;
        Map inputIdsToErrors = (i & 256) != 0 ? bVar.i : map6;
        Map sliderIdsToStates = (i & 512) != 0 ? bVar.f10861j : map7;
        Map switchIdsToStates = (i & 1024) != 0 ? bVar.k : map8;
        Map variantSelectionItemIdsToStates = (i & 2048) != 0 ? bVar.f10862l : map9;
        Map radioOptionParameterKeyToSelectedId = (i & 4096) != 0 ? bVar.f10863m : map10;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(cardsConfig, "cardsConfig");
        Intrinsics.checkNotNullParameter(expandedItemsIds, "expandedItemsIds");
        Intrinsics.checkNotNullParameter(checkedBoxIdsToStates, "checkedBoxIdsToStates");
        Intrinsics.checkNotNullParameter(acceptedDocumentsItemsIds, "acceptedDocumentsItemsIds");
        Intrinsics.checkNotNullParameter(inputIdsToSingleSelectorValues, "inputIdsToSingleSelectorValues");
        Intrinsics.checkNotNullParameter(inputIdsToMaskedTexts, "inputIdsToMaskedTexts");
        Intrinsics.checkNotNullParameter(inputIdsToTexts, "inputIdsToTexts");
        Intrinsics.checkNotNullParameter(inputIdsToDates, "inputIdsToDates");
        Intrinsics.checkNotNullParameter(inputIdsToErrors, "inputIdsToErrors");
        Intrinsics.checkNotNullParameter(sliderIdsToStates, "sliderIdsToStates");
        Intrinsics.checkNotNullParameter(switchIdsToStates, "switchIdsToStates");
        Intrinsics.checkNotNullParameter(variantSelectionItemIdsToStates, "variantSelectionItemIdsToStates");
        Intrinsics.checkNotNullParameter(radioOptionParameterKeyToSelectedId, "radioOptionParameterKeyToSelectedId");
        return new b(cardsConfig, expandedItemsIds, checkedBoxIdsToStates, acceptedDocumentsItemsIds, inputIdsToSingleSelectorValues, inputIdsToMaskedTexts, inputIdsToTexts, inputIdsToDates, inputIdsToErrors, sliderIdsToStates, switchIdsToStates, variantSelectionItemIdsToStates, radioOptionParameterKeyToSelectedId);
    }

    public final b b(String sliderId, l newState) {
        Intrinsics.checkNotNullParameter(sliderId, "sliderId");
        Intrinsics.checkNotNullParameter(newState, "newState");
        return a(this, null, null, null, null, null, null, null, null, null, r0.q(this.f10861j, new Pair(sliderId, newState)), null, null, null, 7679);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f10856a, bVar.f10856a) && Intrinsics.f(this.f10857b, bVar.f10857b) && Intrinsics.f(this.f10858c, bVar.f10858c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f10859g, bVar.f10859g) && Intrinsics.f(this.f10860h, bVar.f10860h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f10861j, bVar.f10861j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f10862l, bVar.f10862l) && Intrinsics.f(this.f10863m, bVar.f10863m);
    }

    public final int hashCode() {
        return this.f10863m.hashCode() + p.a.e(p.a.e(p.a.e(p.a.e(p.a.e(p.a.e(p.a.e(p.a.e(p.a.f(p.a.e(p.a.f(this.f10856a.f233195a.hashCode() * 31, 31, this.f10857b), 31, this.f10858c), 31, this.d), 31, this.e), 31, this.f), 31, this.f10859g), 31, this.f10860h), 31, this.i), 31, this.f10861j), 31, this.k), 31, this.f10862l);
    }

    public b(p5l.c cardsConfig, Set expandedItemsIds, Map checkedBoxIdsToStates, Set acceptedDocumentsItemsIds, Map inputIdsToSingleSelectorValues, Map inputIdsToMaskedTexts, Map inputIdsToTexts, Map inputIdsToDates, Map inputIdsToErrors, Map sliderIdsToStates, Map switchIdsToStates, Map variantSelectionItemIdsToStates, Map radioOptionParameterKeyToSelectedId) {
        Intrinsics.checkNotNullParameter(cardsConfig, "cardsConfig");
        Intrinsics.checkNotNullParameter(expandedItemsIds, "expandedItemsIds");
        Intrinsics.checkNotNullParameter(checkedBoxIdsToStates, "checkedBoxIdsToStates");
        Intrinsics.checkNotNullParameter(acceptedDocumentsItemsIds, "acceptedDocumentsItemsIds");
        Intrinsics.checkNotNullParameter(inputIdsToSingleSelectorValues, "inputIdsToSingleSelectorValues");
        Intrinsics.checkNotNullParameter(inputIdsToMaskedTexts, "inputIdsToMaskedTexts");
        Intrinsics.checkNotNullParameter(inputIdsToTexts, "inputIdsToTexts");
        Intrinsics.checkNotNullParameter(inputIdsToDates, "inputIdsToDates");
        Intrinsics.checkNotNullParameter(inputIdsToErrors, "inputIdsToErrors");
        Intrinsics.checkNotNullParameter(sliderIdsToStates, "sliderIdsToStates");
        Intrinsics.checkNotNullParameter(switchIdsToStates, "switchIdsToStates");
        Intrinsics.checkNotNullParameter(variantSelectionItemIdsToStates, "variantSelectionItemIdsToStates");
        Intrinsics.checkNotNullParameter(radioOptionParameterKeyToSelectedId, "radioOptionParameterKeyToSelectedId");
        this.f10856a = cardsConfig;
        this.f10857b = expandedItemsIds;
        this.f10858c = checkedBoxIdsToStates;
        this.d = acceptedDocumentsItemsIds;
        this.e = inputIdsToSingleSelectorValues;
        this.f = inputIdsToMaskedTexts;
        this.f10859g = inputIdsToTexts;
        this.f10860h = inputIdsToDates;
        this.i = inputIdsToErrors;
        this.f10861j = sliderIdsToStates;
        this.k = switchIdsToStates;
        this.f10862l = variantSelectionItemIdsToStates;
        this.f10863m = radioOptionParameterKeyToSelectedId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i) {
        p5l.c.Companion.getClass();
        p5l.c cVar = p5l.c.f233194b;
        h0 h0Var = h0.f322473a;
        this(cVar, h0Var, r0.g(), h0Var, r0.g(), r0.g(), r0.g(), r0.g(), r0.g(), r0.g(), r0.g(), r0.g(), r0.g());
    }
}
