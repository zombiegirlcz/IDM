package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import com.onfido.api.client.data.LiveVideoChallenges;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesTransformer;", "", "()V", "transform", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;", "liveVideoChallenges", "Lcom/onfido/api/client/data/LiveVideoChallenges;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LivenessChallengesTransformer {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LivenessChallengeType.values().length];
            try {
                iArr[LivenessChallengeType.RECITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivenessChallengeType.MOVEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @NotNull
    public LivenessChallengesViewModel transform(@NotNull LiveVideoChallenges liveVideoChallenges) throws UnknownLivenessChallengeException {
        ?? arrayList;
        List<LiveVideoChallenges.LiveVideoChallenge> challenge;
        Object reciteLivenessChallenge;
        Intrinsics.checkNotNullParameter(liveVideoChallenges, "liveVideoChallenges");
        LiveVideoChallenges.LiveVideoChallengesData data = liveVideoChallenges.getData();
        String id10 = data != null ? data.getId() : null;
        LiveVideoChallenges.LiveVideoChallengesData data2 = liveVideoChallenges.getData();
        if (data2 == null || (challenge = data2.getChallenge()) == null) {
            arrayList = f0.f322471a;
        } else {
            arrayList = new ArrayList(w.t(challenge, 10));
            for (LiveVideoChallenges.LiveVideoChallenge liveVideoChallenge : challenge) {
                try {
                    LivenessChallengeType[] livenessChallengeTypeArrValues = LivenessChallengeType.values();
                    int iB = q0.b(livenessChallengeTypeArrValues.length);
                    int i = 16;
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (LivenessChallengeType livenessChallengeType : livenessChallengeTypeArrValues) {
                        linkedHashMap.put(livenessChallengeType.getId(), livenessChallengeType);
                    }
                    int i2 = WhenMappings.$EnumSwitchMapping$0[((LivenessChallengeType) r0.h(liveVideoChallenge.getType(), linkedHashMap)).ordinal()];
                    if (i2 == 1) {
                        Object query = liveVideoChallenge.getQuery();
                        Intrinsics.i(query, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                        reciteLivenessChallenge = new ReciteLivenessChallenge(d0.c1((List) query));
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MovementType[] movementTypeArrValues = MovementType.values();
                        int iB2 = q0.b(movementTypeArrValues.length);
                        if (iB2 >= 16) {
                            i = iB2;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                        for (MovementType movementType : movementTypeArrValues) {
                            linkedHashMap2.put(movementType.getId(), movementType);
                        }
                        Object query2 = liveVideoChallenge.getQuery();
                        Intrinsics.i(query2, "null cannot be cast to non-null type kotlin.String");
                        reciteLivenessChallenge = new MovementLivenessChallenge((MovementType) r0.h((String) query2, linkedHashMap2));
                    }
                    arrayList.add(reciteLivenessChallenge);
                } catch (NoSuchElementException unused) {
                    throw new UnknownLivenessChallengeException("Type=" + liveVideoChallenge.getType() + ", Query=" + liveVideoChallenge.getQuery());
                }
            }
        }
        Intrinsics.h(id10);
        return new LivenessChallengesViewModel(id10, arrayList);
    }
}
