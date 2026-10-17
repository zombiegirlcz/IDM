package androidx.media3.extractor.metadata.flac;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public abstract class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public VorbisComment(String str, String str2) {
        this.key = Ascii.toUpperCase(str);
        this.value = str2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && getClass() == obj2.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj2;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() + a.c(527, 31, this.key);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numTryParse = Ints.tryParse(this.value);
                if (numTryParse != null) {
                    builder.setTotalTrackCount(numTryParse);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numTryParse2 = Ints.tryParse(this.value);
                if (numTryParse2 != null) {
                    builder.setTotalDiscCount(numTryParse2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numTryParse3 = Ints.tryParse(this.value);
                if (numTryParse3 != null) {
                    builder.setTrackNumber(numTryParse3);
                    break;
                }
                break;
            case "ALBUM":
                builder.setAlbumTitle(this.value);
                break;
            case "GENRE":
                builder.setGenre(this.value);
                break;
            case "TITLE":
                builder.setTitle(this.value);
                break;
            case "DESCRIPTION":
                builder.setDescription(this.value);
                break;
            case "DISCNUMBER":
                Integer numTryParse4 = Ints.tryParse(this.value);
                if (numTryParse4 != null) {
                    builder.setDiscNumber(numTryParse4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                builder.setAlbumArtist(this.value);
                break;
            case "ARTIST":
                builder.setArtist(this.value);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }
}
