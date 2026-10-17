package jv0;

import ix0.d2;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface y extends mz0.c, d2, fr0.h {

    @NotNull
    public static final k Companion = k.f178749a;

    List getAvailableSubtitlesTracks();

    long getContentDuration();

    long getContentPosition();

    boolean getSubtitlesEnabled();

    void setPreferredSubtitlesLanguages(List list);
}
