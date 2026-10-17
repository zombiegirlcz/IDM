package com.github.devnied.emvnfccard.parser;

import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.model.Application;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public interface IParser {
    Pattern getId();

    boolean parse(Application application) throws CommunicationException;
}
