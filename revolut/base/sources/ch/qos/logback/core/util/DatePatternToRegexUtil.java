package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DatePatternToRegexUtil {
    final String datePattern;
    final int datePatternLength;
    final CharSequenceToRegexMapper regexMapper = new CharSequenceToRegexMapper();

    public DatePatternToRegexUtil(String str) {
        this.datePattern = str;
        this.datePatternLength = str.length();
    }

    private List<CharSequenceState> tokenize() {
        ArrayList arrayList = new ArrayList();
        CharSequenceState charSequenceState = null;
        for (int i = 0; i < this.datePatternLength; i++) {
            char cCharAt = this.datePattern.charAt(i);
            if (charSequenceState == null || charSequenceState.f24083c != cCharAt) {
                charSequenceState = new CharSequenceState(cCharAt);
                arrayList.add(charSequenceState);
            } else {
                charSequenceState.incrementOccurrences();
            }
        }
        return arrayList;
    }

    public String toRegex() {
        List<CharSequenceState> list = tokenize();
        StringBuilder sb6 = new StringBuilder();
        Iterator<CharSequenceState> it8 = list.iterator();
        while (it8.hasNext()) {
            sb6.append(this.regexMapper.toRegex(it8.next()));
        }
        return sb6.toString();
    }
}
